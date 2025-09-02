package thread2.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static utility.MyLogger.log;
import static utility.ThreadUtils.sleep;

public class BoundedQueueV3 implements BoundedQueue{
    private final Queue<String> queue= new ArrayDeque<>();
    private final int max;

    public BoundedQueueV3(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        if (queue.size() == max){
            log("PUT 큐가 가득참 : " +data);
            try{
               wait();
               log("PUT 생산자가 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(data);
        log("PUT 생산자 데이터 저장 notify 호출");
        notify();
    }

    @Override
    public synchronized String take() {
        while(queue.isEmpty()) {
            log("TAKE 큐에 데이터가 없음 소비자대기");
            try {
                wait();
                log("TAKE 소비자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            String data = queue.poll();
            log("TAKE  소비자 데이터 획득 notify() 호출");
            notify();
            return  data;
    }

    @Override
    public String toString() {
        return queue.toString();
    }

}
