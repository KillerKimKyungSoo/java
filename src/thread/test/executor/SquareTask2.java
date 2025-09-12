package thread.test.executor;

import java.util.concurrent.Callable;

public class SquareTask2 implements Callable<Integer> {
    private int a;
    private int b;

    public SquareTask2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        int c=0;
        System.out.println("작업시작 : " + Thread.currentThread().getName());
        try{
            c=a*b;
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("오류");
        }
        System.out.println("작업종료 : " + Thread.currentThread().getName());
        return c;
    }
}
