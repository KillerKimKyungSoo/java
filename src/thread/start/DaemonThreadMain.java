package thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " :main() start");
        DaemonThread daemonThread = new DaemonThread();
       // daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println(Thread.currentThread().getName() + " : main() end");
    }
}
