package june17day.ex2;

public class SlackNotifier implements Notifier{
    private final String channel;

    public SlackNotifier(String channel) {
        this.channel = channel;
    }

    @Override
    public void send(String message) throws Exception {
        System.out.println("[SLACK] #" + channel + " - " + message);
    }
}
