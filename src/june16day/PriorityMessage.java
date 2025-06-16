package june16day;

public class PriorityMessage implements Comparable<PriorityMessage>{
    private final String message;
    private final int priority;
    public PriorityMessage(String message, int priority) {
        this.message = message;
        this.priority = priority;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public int compareTo(PriorityMessage other) {
        return Integer.compare(this.priority, other.priority);
    }
}
