package thread.test.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BasicExecutorSample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            int jobID= i;
            pool.submit(()->{
                String t = Thread.currentThread().getName();
                        System.out.printf("[%s] 작업 #%d 실행 %n",t,jobID);
                        try{
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    );
        }

        pool.shutdown();
        if(!pool.awaitTermination(5, TimeUnit.SECONDS)){
            pool.shutdownNow();
        }
        System.out.println("종료");
    }
}
