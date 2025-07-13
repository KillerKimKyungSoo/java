package thread.start;

public class KsHelloRunable implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : ksHello");
    }
}
