package thread.start;

public class KsHelloRunableMain {
    public static void main(String[] args) {
        KsHelloRunable ksHelloRunable = new KsHelloRunable();
        Thread thread = new Thread(ksHelloRunable);
        thread.start();
    }
}
