package thread.control.join;
import  static util.ThreadUtils.*;
import static util.MyLogger.*;
public class JoinMainV4 {
    public static void main(String[] args) throws InterruptedException {
        log("start");

        Thread thread1=new Thread(new SumTask(1,50) ,"thread1");

        SumTask sumTask1 = new SumTask(51,100);
        Thread thread = new Thread(sumTask1,"thread2");

        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        log("result : " + sumTask1.result  );
    }

    static class SumTask  implements Runnable{
        int startValue;
        int endValue;
        int result=0;
        public SumTask(int startValue, int endValue){
            this.startValue=startValue;
            this.endValue=endValue;
        }

        @Override
        public void run() {
            int sum=0;
            for (int i = startValue; i <= endValue ; i++) {
                sum +=i;
            }
            result=sum;
            log("result 1 : " + result);
        }
    }
}
