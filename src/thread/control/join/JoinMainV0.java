package thread.control.join;
import static util.ThreadUtils.*;
import static util.MyLogger.*;
public class JoinMainV0 {
    public static void main(String[] args) {
        log("start");
        Thread thread1 = new Thread(new job(),"thread-1");
        Thread thread2 = new Thread(new job(),"thread-2");
        thread1.start();
        thread2.start();
        log("END");
    }

    static class job implements Runnable{
        @Override
        public void run() {
            log("작업시작");
            sleep(2000);
            log("작업완료");
        }
    }
}
