package thread.test.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallableSample2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<Integer> future1= executorService.submit (new SumTask2(10));
        Future<Integer> future2= executorService.submit (new SumTask2(40));
        Future<Integer> future3= executorService.submit (new SumTask2(50));
        try{
            int result1 = future1.get();
            int result2 = future2.get();
            int result3 = future3.get();
            int sum =  result1 + result2 + result3;
            System.out.println("총합 : " + sum );
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }

    }
}
