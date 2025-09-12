package thread.test.executor;

import java.util.*;
import java.util.concurrent.*;

public class MultiServerMonitor {
    private final ExecutorService executorService = Executors.newFixedThreadPool(5);
    private final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    private final Map<String,Integer>  failCounts = new HashMap<>();
    private final int maxFailures=3;

    public void startMonitoring(List<String> servers){
        Runnable monitoringTask= ()->{
            try{
                List<Callable<Boolean>> tasks = new ArrayList<>();
                Map<Callable<Boolean>,String> taskMap = new HashMap<>();
                for(String server : servers){
                    ServerCheckTask task = new ServerCheckTask(server);
                    tasks.add(task);
                    taskMap.put(task,server);
                }
                List<Future<Boolean>> results = executorService.invokeAll(tasks);

                int idx=0;
                for(Future<Boolean> future : results){
                    String server = servers.get(idx++);
                    boolean isAlive = future.get();
                    updateStatus(server,isAlive);
                }
            }catch (InterruptedException | ExecutionException e){
                e.printStackTrace();
            }
        };
        scheduledExecutorService.scheduleAtFixedRate(monitoringTask,0,5,TimeUnit.SECONDS);
        scheduledExecutorService.schedule(()->
        {
            System.out.println("모니터 종료");
            scheduledExecutorService.shutdown();
            executorService.shutdown();
        },1,TimeUnit.MINUTES);
    }

    private  void updateStatus(String server,boolean isAlive){
        if(isAlive){
            failCounts.put(server,0);
        }else{
            int failures = failCounts.getOrDefault(server,0) +1;
            failCounts.put(server,failures);
            if(failures>=maxFailures){
                sendAlert(server);
                failCounts.put(server,0);
            }
        }
    }
    private void sendAlert(String server) {
        System.out.println("🚨 ALERT: " + server + " 서버에서 연속 장애 발생!");
    }

    public static void main(String[] args) {
        MultiServerMonitor monitor = new MultiServerMonitor();
        List<String> servers = Arrays.asList("Server-A", "Server-B","Server-C","Server-D","Server-E");
        monitor.startMonitoring(servers);
    }
}
