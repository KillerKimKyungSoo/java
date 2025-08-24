package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadStopMainV4 {
    public static void main(String[] args) {
                MyTask myTask = new MyTask();
                Thread thread =  new Thread(myTask,"work");
                thread.start();

                sleep(100);
                log("작업중단 지시 runFlag = false");
               thread.interrupt();
               log("work 스레드 인터럽트 상태 1 : " + thread.isInterrupted());
    }

    static class MyTask implements Runnable{

        @Override
        public void run() {

                while (!Thread.interrupted()) {
                    log("작업중");
                }
                log("work 스레드 인터럽트 상태 2 =" + Thread.currentThread().isInterrupted());
                try{
                    log("자원정리 시도");
                    Thread.sleep(1000);
                    log("자원정리 완료 ");
                }
              catch (InterruptedException e){
                    log("자원정리 실패 자원정리중 Interrupt 발생");
                    log("work 스레드 인터럽트 상태2 : " + Thread.currentThread().isInterrupted());
                    log("interrupt message = " + e.getMessage());
                    log("state = " + Thread.currentThread().getState());
            }

            log("작업종료");
        }
    }
}
