package june16day;

public abstract class BaseNotifier implements Notifier {
    protected String senderName;

    public BaseNotifier(String senderName) {
        this.senderName = senderName;
    }
    public void log(String message){
        System.out.println("[" + senderName + "] 발송로그 : " + message );
    }
}
