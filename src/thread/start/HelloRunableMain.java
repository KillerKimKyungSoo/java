package thread.start;

public class HelloRunableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " main()");
        HelloRunable helloRunable = new HelloRunable();
        Thread thread = new Thread(helloRunable);
        thread.start();
        System.out.println(Thread.currentThread().getName() + " main() end");
    }
}
