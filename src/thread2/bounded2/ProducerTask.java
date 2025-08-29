package thread2.bounded2;

import java.util.Queue;

import static utility.MyLogger.log;

public class ProducerTask implements  Runnable{
    private BoundedQueue queue;
    private String request;

    public ProducerTask(BoundedQueue queue, String request) {
        this.queue = queue;
        this.request = request;
    }

    @Override
    public void run() {
        log("생산시도 :" + request + " -> " + queue);
        queue.put(request);
        log("생산완료 : "+ request + " -> " + queue);
    }
}
