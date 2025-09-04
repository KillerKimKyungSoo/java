package thread2.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static utility.MyLogger.log;

public class BoundedQueueV6_3 implements BoundedQueue {
    private BlockingQueue<String> queue;

    public BoundedQueueV6_3(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {
        try{
            boolean result =queue.offer(data,1, TimeUnit.MICROSECONDS);
            log("저장시도 결과 : " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String take() {
        try{
            return queue.poll(2,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "BoundedQueueV6_1{" +
                "queue=" + queue +
                '}';
    }
}
