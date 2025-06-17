package june17day.ex1;

public class SlackNotifier implements Notifier{
    private String channel;

    public SlackNotifier(String channel) {
        this.channel = channel;
    }

    @Override
    public void send(String message) {
        System.out.println("[SLACK] 채널: #" + channel + " - 내용: " + message);
    }
}
