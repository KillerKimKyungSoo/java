package thread2.bounded2;

public interface BoundedQueue {
    void put(String data);
    String take();
}
