package thread2.bounded2;
import java.util.ArrayDeque;
import java.util.Queue;

import static utility.ThreadUtils.*;
import static utility.MyLogger.*;
public class BoundQueueV1 implements BoundedQueue{
    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundQueueV1(int max) {
        this.max = max;
    }

    @Override
    public void put(String data) {
        if (queue.size()==max)
        {
            log("queue size 가 다참");
            return;
        }
        queue.offer(data);
    }

    @Override
    public String take() {
        if (queue.isEmpty()){

            return null;
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return  queue.toString();
    }
}
