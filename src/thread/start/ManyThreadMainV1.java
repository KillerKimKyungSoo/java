package thread.start;
import static util.MyLogger.*;
public class ManyThreadMainV1 {
    public static void main(String[] args) {
        log("main start");
        KsHelloRunable ksHelloRunable = new KsHelloRunable();
        Thread thread = new Thread(ksHelloRunable);
        thread.start();

        Thread thread2 = new Thread(ksHelloRunable);
        thread2.start();

        Thread thread3 = new Thread(ksHelloRunable);
        thread3.start();
        log("main() end");
    }
}
