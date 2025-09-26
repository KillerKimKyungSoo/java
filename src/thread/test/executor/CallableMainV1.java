package thread.test.executor;

import java.util.Random;
import java.util.concurrent.*;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class CallableMainV1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<Integer> future =es.submit(new MyCallable() );
        Integer result = future.get();
        log("result value : " + result);
        es.close();
    }

    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            log("callable 시작");
            sleep(3000);
            int value = new Random().nextInt(10);
            log("Create Value :  " + value);
            log("Callable 종료");
            return value;
        }
    }
}
