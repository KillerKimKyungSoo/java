package thread.test.executor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAnyExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = Arrays.asList(
                new RandomSleepTask("작업-1"),
                new RandomSleepTask("작업-2"),
                new RandomSleepTask("작업-3"),
                new RandomSleepTask("작업-4")
        );
        String result = executorService.invokeAny(tasks);
        System.out.println("가장빨리나온 결과 : " + result);
        executorService.shutdown();
    }
}
