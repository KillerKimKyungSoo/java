package thread2.bounded2;
import static utility.MyLogger.log;
import static utility.ThreadUtils.*;

import java.util.ArrayList;
import java.util.List;

public class BoundedMain {
    public static void main(String[] args) {
        BoundedQueue queue = new BoundQueueV1(2);
        ConsumerFirst(queue);
    }
    private static void ConsumerFirst(BoundedQueue queue){
        log("소비자 먼저실행  시작 , " + queue.getClass().getSimpleName() + " ==");
        List<Thread> threads=new ArrayList<>();
        startConsumer(queue, threads);
        printAllState(queue,threads);
        startProducer(queue, threads);
        printAllState(queue, threads);
        log("==소비자 먼저실행 종료 , " + queue.getClass().getSimpleName() + " ==");
    }
    private static void ProducerFirst(BoundedQueue queue){
        log("== 생성자 먼저 실행 == 시작, " + queue.getClass().getSimpleName() + " ==");
        List<Thread> threads = new ArrayList<>();
        startProducer(queue, threads);
        printAllState(queue,threads);
        startConsumer(queue,threads);
        printAllState(queue,threads);
        log("== 생성자 먼저 실행 == 종료, " + queue.getClass().getSimpleName() + " ==");
    }
    private static void startConsumer(BoundedQueue queue, List<Thread> threads){
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new  ConsumerTask(queue),"");
            threads.add(thread);
            thread.start();
            sleep(100);
        }
    }

    private static void startProducer(BoundedQueue queue, List<Thread> threads){
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread (new ProducerTask(queue , "data" +i));
            thread.start();
            sleep(100);
        }
    }

    private static void printAllState( BoundedQueue queue, List<Thread> threads){
        System.out.println();
        log("현재 출력 상태 : " + queue);
        for(Thread thread : threads){
            log(thread.getName() + ":" + thread.getState());
        }
    }

}
