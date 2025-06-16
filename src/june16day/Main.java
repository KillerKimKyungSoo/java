package june16day;

public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier("경고봇");
        Notifier notifierWithRetry = new RetryingNotifierDecorator(baseNotifier, 3);
        NotifierQueueProcessor processor = new NotifierQueueProcessor(notifierWithRetry);

        processor.addMessage("1순위: 서버 다운", 1);
        processor.addMessage("3순위: 배포 완료", 3);
        processor.addMessage("2순위: CPU 과부하", 2);

        processor.processAll();
    }
}
