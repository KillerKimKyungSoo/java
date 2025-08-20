package thread2;

public class HelloThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " : run()");
    }
}
