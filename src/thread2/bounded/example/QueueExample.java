package thread2.bounded.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String > queue = new ArrayDeque<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
