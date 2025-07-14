package thread.control.interrupt;
import static util.ThreadUtils.*;
import static util.MyLogger.*;

public class ThreadStopMainV1 {
    public static void main(String[] args) {
                MyTask myTask = new MyTask();
                Thread thread =  new Thread(myTask,"work");
                thread.start();

                sleep(4000);
                log("작업중단 지시 runFlag = false");
                myTask.runFalg=false;
    }

    static class MyTask implements Runnable{
        volatile boolean runFalg =true;
        @Override
        public void run() {
            while (runFalg){
                log("작업중");
                sleep(3000);
            }
            log("자원정리");
            log("작업종료");
        }
    }
}
