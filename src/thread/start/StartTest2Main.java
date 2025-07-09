package thread.start;

import static util.MyLogger.log;

public class StartTest2Main {
    public static void main(String[] args) {
       myRunable myRunable = new myRunable();
       Thread thread = new Thread(myRunable);
        thread.start();

    }
    static class myRunable implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                log("vlaue : "+ i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
