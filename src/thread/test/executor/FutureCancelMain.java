package thread.test.executor;

import java.util.concurrent.*;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class FutureCancelMain {
    private static boolean mayInterruptIfRunning= true;
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(1);
        Future<String> future = es.submit(new MyTask());
        log("Future.state" + future.state());
        sleep(3000);
        log("future.cancel(" + mayInterruptIfRunning + ") 호출");
        boolean cancelResult  = future.cancel(mayInterruptIfRunning);
        log("Future.state " + future.state());
        log("cancel("+ mayInterruptIfRunning + ") result : " + cancelResult);

        //결과확인
        try{
            log("Future result : " + future.get());
        } catch (CancellationException e){
            log("Future는 이미취소 되었습니다");
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }

    }

    static class MyTask implements Callable<String>{
        @Override
        public String call() throws Exception {
            try{
                for (int i = 0; i < 10; i++) {
                    log("작업중 : " + i);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                log("인터럽트 발생");
                return "Interrupted";
            }
            return "Completed";
        }
    }
}
