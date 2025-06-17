package june17day.ex2;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;


public class Main6 {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier("admin@example.com");
        Notifier slack = new SlackNotifier("alerts");
        Notifier sms = new SmsNotifier("010-1234-5678");

        // 성공 시 알림: 이메일 + 슬랙
        Notifier multiNotifier = new MultiNotifier(Arrays.asList(email, slack));

        // 실패 시 알림: SMS
        Notifier fallback = new FallbackNotifier(multiNotifier, sms);

        // 작업 정의
        List<Task> tasks = Arrays.asList(
                new Task("서버 백업"),
                new Task("로그 정리"),
                new Task("보안 점검")
        );

        // TaskRunner 생성
        TaskRunner runner = new TaskRunner(multiNotifier, fallback);

        // 스케줄러 설정 (5초마다 반복 실행)
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("\n=== 작업 시작 ===");
            try {
                runner.runTask(tasks);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("=== 작업 종료 ===\n");
        }, 0, 10, TimeUnit.SECONDS); // 최초 0초 후, 10초마다 반복

        // 메인 스레드 대기 (30초 후 종료)
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduler.shutdown();
    }
}
