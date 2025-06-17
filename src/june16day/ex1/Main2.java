package june16day.ex1;

public class Main2 {
    public static void main(String[] args) {
        Notifier notifier = new ConsoleNotifier("알리봇");
        SimpleNotifierProcessor processor = new SimpleNotifierProcessor(notifier);
        processor.addMessage("서버가 시작되었습니다");
        processor.addMessage("업데이트가 완료 되었습니다.");
        processor.addMessage("서버가 종료");
        processor.processAll();
    }
}
