package thread.start;
import static  util.MyLogger.*;
public class InnerRunnableMainV1 {
    public static void main(String[] args) {
        log("main() start");
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable);
        thread.start();
        log("main() end");
    }
    static class MyRunable implements Runnable{
        @Override
        public void run() {
            log("run()");
        }
    }
}
