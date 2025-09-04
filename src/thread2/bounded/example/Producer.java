package thread2.bounded.example;

public class Producer extends  Thread{
    private final BoundedBuffer<Integer> buffer;
    public Producer(BoundedBuffer<Integer> buffer){
        this.buffer=buffer;
    }

    @Override
    public void run() {
        try{
            for (int i = 1; i <=5 ; i++) {
                buffer.put(i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
