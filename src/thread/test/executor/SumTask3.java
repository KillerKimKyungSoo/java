package thread.test.executor;

import java.util.concurrent.Callable;

public class SumTask3 implements Callable<String> {
    private int startValue;
    private int endValue;

    public SumTask3(int startValue, int endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }

    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = startValue; i <= endValue ; i++) {
            sum+=i;
        }
        return "총합은 " + sum;
    }
}
