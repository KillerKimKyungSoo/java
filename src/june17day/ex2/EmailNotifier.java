package june17day.ex2;

public class EmailNotifier implements Notifier {
    private final String email;
    public EmailNotifier(String email){
        this.email = email;
    }
    @Override
    public void send(String message) throws Exception {
        System.out.println("Email : " + email + "  :  " + message);
    }
}
