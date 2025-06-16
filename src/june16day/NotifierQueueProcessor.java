package june16day;

import java.util.PriorityQueue;

public class NotifierQueueProcessor {
    private final Notifier notifier;
    private final PriorityQueue<PriorityMessage> queue = new PriorityQueue<>();
    public NotifierQueueProcessor(Notifier notifier) {
        this.notifier = notifier;
    }

    public void addMessage(String message, int priority) {
        queue.add(new PriorityMessage(message, priority));
    }

    public void processAll() {
        while (!queue.isEmpty()) {
            PriorityMessage msg = queue.poll();
            try {
                notifier.send(msg.getMessage());
            } catch (Exception e) {
                System.out.println("메시지 전송 실패: " + msg.getMessage());
            }
        }
    }


}
