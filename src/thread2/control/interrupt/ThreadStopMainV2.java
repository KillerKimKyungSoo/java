package thread2.control.interrupt;
import static utility.ThreadUtils.*;
import static utility.MyLogger.*;
public class ThreadStopMainV2 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task ,"work");
        thread.start();

        sleep(4000);
        log("작업중단지시 thread.interrupt");
        thread.interrupt();
        log("work 스레드 인터럽트 상태 1" + thread.isInterrupted());
    }

    static class MyTask implements Runnable{
        @Override
        public void run(){
            try{
                while(true){
                    log("작업중");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                log("work 스레드 인터럽트 상태 2 = " + Thread.currentThread().isInterrupted());
                log("Interrupt message = " + e.getMessage());
                log("state = " + Thread.currentThread().getState());
            }
            log("자원 정리");
            log("작업종료");
        }
    }
}
