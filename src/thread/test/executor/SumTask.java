package thread.test.executor;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer> {
    private final int start;
    private final  int end;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum +=i;
            System.out.println("열라 계산중 ");
            Thread.sleep(100);
        }
        System.out.println(Thread.currentThread().getName() + "계산완료 : " + start + "~" + end + ":" + sum);
        return sum;
    }
}
