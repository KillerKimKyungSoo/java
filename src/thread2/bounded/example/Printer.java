package thread2.bounded.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {
    private final Lock lock = new ReentrantLock();
    public void printDocument(String docName, String threadName){
        try{
            if(lock.tryLock(500, TimeUnit.MICROSECONDS)){
                try{
                    System.out.println(threadName + " 프린터 사용시작 : " + docName);
                    Thread.sleep(1000);
                    System.out.println(threadName + " 프린터 사용완료 : " + docName);
                }finally {
                    lock.unlock();
                }
            }else{
                System.out.println(threadName + " 프린터 사용불가 문서 [ " +  docName + "]");
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println(threadName + " 인터럽트 발생");
        }
    }
}
