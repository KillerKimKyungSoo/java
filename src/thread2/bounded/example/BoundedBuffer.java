package thread2.bounded.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer <T>{
    private final Queue<T> queue = new LinkedList<>();
    private final int capacity;
    private final Lock lock =new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public void put(T item) throws InterruptedException{
        lock.lock();
        try{
            while (queue.size() ==capacity){
                System.out.println("버퍼가득참 -> 생산자대기 ");
                notFull.await();
            }
            queue.add(item);
            System.out.println("생산 : " +item + "버퍼크기 = " +queue.size());
            notEmpty.signal();
        }finally {
            lock.unlock();
        }
    }

    public T take()throws InterruptedException{
     lock.lock();
     try{
         while (queue.isEmpty()){
             System.out.println("버퍼가 비어있음 ->소비자 대기");
             notEmpty.await();
         }
         T item =queue.poll();
         System.out.println("소비 : " + item + "버퍼크기 = " + queue.size());
         notFull.signal();
         return  item;
     } finally {
         lock.unlock();
     }
    }
}
