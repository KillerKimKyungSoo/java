package thread.start;
import static util.MyLogger.*;
public class StartTest1Main {
    public static void main(String[] args) {
       myRunable myRunable = new myRunable();
        myRunable.start();


    }
    static class myRunable extends Thread{
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
