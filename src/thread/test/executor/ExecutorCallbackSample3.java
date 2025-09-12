package thread.test.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallbackSample3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String > result1= executorService.submit(new SumTask3(2,10));
        Future<String > result2= executorService.submit(new SumTask3(22,30));
        Future<String > result3= executorService.submit(new SumTask3(32,40));
        Future<String > result4= executorService.submit(new SumTask3(42,50));
        Future<String > result5= executorService.submit(new SumTask3(52,60));
        Future<String > result6= executorService.submit(new SumTask3(62,70));
        try{
            System.out.println(result1.get());
            System.out.println(result2.get());
            System.out.println(result3.get());
            System.out.println(result4.get());
            System.out.println(result5.get());
            System.out.println(result6.get());
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }

    }
}

