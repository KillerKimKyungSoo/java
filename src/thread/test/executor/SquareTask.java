package thread.test.executor;

import java.util.concurrent.Callable;

public class SquareTask implements Callable<Integer> {
    private final int number;
    public SquareTask(int number){
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " 시작 : " +number);
        Thread.sleep(2000);
        int result = number*number;
        System.out.println(Thread.currentThread().getName() + " 완료 :" + result);
        return result;
    }
}
