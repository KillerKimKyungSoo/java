package thread2.volatile1;
import static utility.ThreadUtils.*;
import static utility.MyLogger.*;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread( task,"work");
        t.start();
        sleep(1000);
        task.flag=false;
        log("flag =" + task.flag + ", count = " + task.count + " in main");
    }

    static class MyTask implements Runnable{
        volatile boolean flag = true;
        volatile long count ;
        @Override
        public void run(){
            while(flag){
                count ++;
                if(count % 10000000==0){
                    log("flag = " + flag + " , count = " + count + " in while()");
                }
            }
            log("flag = " + flag + ", count = " + count + " 종료");
        }
    }
}
