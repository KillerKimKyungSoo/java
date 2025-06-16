package june16day;

public class SlackNotifier extends BaseNotifier{
    public SlackNotifier(String senderName){
        super(senderName);
    }
    @Override
    public void send(String message) {
        System.out.println("슬랙발송 : " + message);
    }
}
