package june16day.ex1;

public class ConsoleNotifier implements Notifier{
    private String senderName;
    public ConsoleNotifier(String senderName){
        this.senderName = senderName;
    }
    @Override
    public void send(String  message){
        System.out.println("[" + senderName + "]" + message);
    }
}
