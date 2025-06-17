package june17day.ex1;

public class EmailNotifier implements Notifier{
    private String emilAddress;
    public  EmailNotifier(String emilAddress){
        this.emilAddress = emilAddress;
    }
    @Override
    public void send(String message) {
        System.out.println("[Email to ] : " + emilAddress + " - 내용 : " +  message);
    }
}
