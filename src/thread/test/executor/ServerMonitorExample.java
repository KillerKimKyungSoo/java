package thread.test.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ServerMonitorExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        ServerMonitor monitor = new ServerMonitor("MainServer");
        scheduledExecutorService.scheduleAtFixedRate(monitor::checkStatus,0,5, TimeUnit.SECONDS);

        scheduledExecutorService.schedule(()->{
            System.out.println("모니터 종료");
            scheduledExecutorService.shutdown();
        },1,TimeUnit.MINUTES);
    }
}
