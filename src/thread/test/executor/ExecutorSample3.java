package thread.test.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorSample3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Task3("작업이름 "+i));
        }
        executorService.shutdown();
        try{
            if(!executorService.awaitTermination(5, TimeUnit.SECONDS)){
                executorService.shutdown();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            executorService.shutdown();
        }

    }
}
