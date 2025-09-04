package thread2.bounded.example;

public class Consumer extends  Thread{
    private final BoundedBuffer<Integer> buffer;

    public Consumer(BoundedBuffer<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.take();
                Thread.sleep(500); // 소비 속도 조절
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
