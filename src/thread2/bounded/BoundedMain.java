package thread2.bounded;
import utility.ThreadUtils;

import java.util.ArrayList;
import java.util.List;

import static utility.MyLogger.*;
import static utility.ThreadUtils.*;

public class BoundedMain {
    public static void main(String[] args) {
        //BoundedQueue queue = new BoundedQueueV1(2);
        BoundedQueue queue = new BoundedQueueV3(2);
        producerFirst(queue);
        //consumerFirst(queue);
    }
    private static void producerFirst(BoundedQueue queue){
        log("== 생성자 먼저 실행 == 시작, " + queue.getClass().getSimpleName() + " ==");
        List<Thread> threads = new ArrayList<>();
        startProducer(queue, threads);
        printAllState(queue,threads);
        startConsumer(queue,threads);
        printAllState(queue,threads);
        log("== 생성자 먼저 실행 == 종료, " + queue.getClass().getSimpleName() + " ==");
    }

    private static void consumerFirst(BoundedQueue queue){
        log("소비자 먼저실행  시작 , " + queue.getClass().getSimpleName() + " ==");
        List<Thread> threads=new ArrayList<>();
        startConsumer(queue, threads);
        printAllState(queue,threads);
        startProducer(queue, threads);
        printAllState(queue, threads);
        log("==소비자 먼저실행 종료 , " + queue.getClass().getSimpleName() + " ==");
    }
    private static void startProducer(BoundedQueue queue, List<Thread> threads){
        System.out.println();
        log("생산자 시작");
        for (int i = 1 ; i <= 3; i++) {
            Thread producer = new Thread(new ProducerTask(queue,"data"+i) ,"producer"+1);
            threads.add(producer);
            producer.start();
            sleep(100);
        }
    }

    private static void startConsumer(BoundedQueue queue, List<Thread> threads ){
        System.out.println();
        log("소비자 시작 ");
        for (int i = 1; i <=3 ; i++) {
            Thread consumer = new Thread(new ConsumerTask(queue), "consumer" +1);
            threads.add(consumer);
            consumer.start();
            sleep(100);
        }
    }

    private static void printAllState(BoundedQueue queue, List<Thread> threads){
        System.out.println();
        log("현재 출력 상태 : " + queue);
        for(Thread thread : threads){
            log(thread.getName() + ":" + thread.getState());
        }
    }
}
