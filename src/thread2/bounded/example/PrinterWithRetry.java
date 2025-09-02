package thread2.bounded.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterWithRetry {
    private final Lock lock=new ReentrantLock();
    public void printDocument(String docName, String threadName){
        int maxRetries=3;
        int attempt=0;
        boolean printed = false;
        while (attempt < maxRetries && !printed){
            attempt++;
            try{
                if(lock.tryLock(300, TimeUnit.MICROSECONDS)){
                    try {
                        System.out.println(threadName + " 프린터 사용시작 시도 -> " + attempt);
                        Thread.sleep(1000);
                        System.out.println(threadName + " 프린터 사용완료 : " + docName);
                        printed=true;
                    }finally {
                        lock.unlock();
                    }
                }
                else {
                    System.out.println(threadName + " 프린터 사용 대기중 ..시도->" + attempt);
                }
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println(threadName + " 인터럽트 발생");
                return;
            }
        }
        if(!printed){
            System.out.println(threadName + "프린터 사용불가 ");
        }
    }
}
