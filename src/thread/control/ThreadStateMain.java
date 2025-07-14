package thread.control;


import static util.MyLogger.*;
public class ThreadStateMain  {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunable(),"myThreat");
        log("myThread.stat1 : " + Thread.currentThread().getState());
        log("myThread.start");
        thread.start();
        Thread.sleep(1000);
        log("myThread.state3 = :" + thread.getState());
        Thread.sleep(4000);
        log("myThread.state5 : " + thread.getState());
    }

    static class MyRunable implements Runnable{
        @Override
        public void run() {
            try{
                log("Start");
                log("myThread.state2 " + Thread.currentThread().getState());
                log("sleep Start");
                Thread.sleep(3000);
                log("sllep end");
                log("myThread.state4 : " +Thread.currentThread().getState());
                log("end");
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
