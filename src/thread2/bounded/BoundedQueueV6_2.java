package thread2.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import  static utility.MyLogger.*;

public class BoundedQueueV6_2 implements BoundedQueue {
    private BlockingQueue<String> queue;

    public BoundedQueueV6_2(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {
         boolean result = queue.offer(data);
         log("저장시도 결과 : " + result);
    }

    @Override
    public String take() {
        return queue.poll();
    }

    @Override
    public String toString() {
        return "BoundedQueueV6_1{" +
                "queue=" + queue +
                '}';
    }
}
