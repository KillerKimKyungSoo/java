package thread2.control;

import static utility.MyLogger.log;
import static utility.ThreadUtils.sleep;

public class JoinMainV3 {
    public static void main(String[] args) throws InterruptedException {
        log("START");
        SumTask task1 = new SumTask(1,50);
        SumTask task2 = new SumTask(51,100);
        Thread thread1 = new Thread(task1,"thread-1");
        Thread thread2 = new Thread(task2, "thread-2");
        thread1.start();
        thread2.start();
        log("join() - main 스레드가 thread 1 , thread2 종료까지 대지");
        thread1.join();
        thread2.join();
        log("main 스레드 대기 완료");
        log("task1.result = " + task1.result);
        log("task2.result = " + task2.result);
        int sumAll =task1.result + task2.result;
        log("task1 + task2 = " + sumAll);
        log("END");
    }

    static class SumTask implements Runnable{
        int startValue;
        int endValue;
        int result=0;
        public SumTask(int startValue, int endValue){
            this.startValue= startValue;
            this.endValue = endValue;
        }
        @Override
        public void run(){
            log("작업시작");
            sleep(2000);
            int sum=0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            result=sum;
            log("작업완료 result : " + result);
        }
    }
}
