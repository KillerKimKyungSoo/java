package thread.test.executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExaple2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Callable<Integer>> futures = Arrays.asList(
                new SquareTask2(1,4),
                new SquareTask2(2,4),
                new SquareTask2(3,4),
                new SquareTask2(4,4),
                new SquareTask2(5,4),
                new SquareTask2(6,4)
        );
        List<Future<Integer>> results =  executorService.invokeAll(futures);

        for (Future<Integer> f : results){
            System.out.println("결과출력 : " + f.get());
        }
        executorService.shutdown();

    }
}
