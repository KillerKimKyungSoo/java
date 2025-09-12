package thread.test.executor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Callable<Integer>> tasks = Arrays.asList(
                new SquareTask(5),
                new SquareTask(6),
                new SquareTask(7),
                new SquareTask(8)
        ) ;
        List<Future<Integer>> futures = executorService.invokeAll(tasks);
        System.out.println("==================  모든결과 출력============");
        for(Future<Integer> f : futures){
            System.out.println("결과출력 : " + f.get());
        }
        executorService.shutdown();
    }
}
