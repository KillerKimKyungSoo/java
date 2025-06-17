package june17day.ex2;

public class SmsNotifier implements Notifier{
    private final String phoneNumber;

    public SmsNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) throws Exception {
        System.out.println("[SMS] To " + phoneNumber + " - " + message);
    }
}
