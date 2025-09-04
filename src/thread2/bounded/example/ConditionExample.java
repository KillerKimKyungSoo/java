package thread2.bounded.example;

public class ConditionExample {
    public static void main(String[] args) {
        BoundedBuffer<Integer> buffer = new BoundedBuffer<>(2);

        Thread producer = new Producer(buffer);
        Thread consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
