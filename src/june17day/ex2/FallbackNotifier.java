package june17day.ex2;

public class FallbackNotifier implements  Notifier{
    private final Notifier mainNotifier;
    private final Notifier fallbackNotifier;

    public FallbackNotifier(Notifier mainNotifier, Notifier fallbackNotifier) {
        this.mainNotifier = mainNotifier;
        this.fallbackNotifier = fallbackNotifier;
    }

    @Override
    public void send(String message) throws Exception {
        try{
            mainNotifier.send(message);
        } catch (Exception e) {
            System.out.println("기본 Notifier 실패 → 대체 알림으로 전송");
            fallbackNotifier.send(message);
        }
    }
}
