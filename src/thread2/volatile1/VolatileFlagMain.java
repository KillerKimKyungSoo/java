package thread2.volatile1;
import static utility.ThreadUtils.*;
import static utility.MyLogger.*;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task,"work");
        log("runFlag = " + task.rumFlag);
        t.start();
        sleep(1000);
        log("runFlag를 false 로 변경시도");
        task.rumFlag=false;
        log("runFlag : " + task.rumFlag);
        log("main종료");
    }
    static class MyTask implements Runnable{
        boolean rumFlag = true;
        @Override
        public void run(){
            log("task시작");
            while(rumFlag){

            }
            log("task종료");
        }
    }
}
