package thread.start;

import static util.MyLogger.log;

public class ManyThreadMainV2 {
    public static void main(String[] args) {
        log("main start");
        KsHelloRunable ksHelloRunable = new KsHelloRunable();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(ksHelloRunable);
            thread.start();
        }
        log("main() end");
    }
}
