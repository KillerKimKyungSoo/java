package thread.test.executor;

import java.util.concurrent.Callable;

public class SumTask2 implements Callable<Integer> {
    private final int a;
    private int sum;
    public SumTask2(int a) {
        this.a = a;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i <= a; i++) {
            sum +=i;
            Thread.sleep(100);
        }
        return sum;
    }
}
