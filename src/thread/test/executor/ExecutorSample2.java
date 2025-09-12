package thread.test.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorSample2 {

    public static void main(String[] args) {
        ExecutorService executorService =Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Task("작업  " + i));
        }
        executorService.shutdown();
        try{
            if(!executorService.awaitTermination(10, TimeUnit.SECONDS)){
                executorService.shutdown();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
        System.out.println("모든작업 종료");
    }


}
