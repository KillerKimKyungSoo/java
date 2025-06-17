package june17day.ex2;

import java.util.List;

public class TaskRunner {
    private final Notifier successNotifier;
    private final Notifier failureNotifier;

    public TaskRunner(Notifier successNotifier, Notifier failureNotifier) {
        this.successNotifier = successNotifier;
        this.failureNotifier = failureNotifier;
    }
    public void runTask(List<Task> tasks) throws Exception {
        for (Task task : tasks) {
            try {
                task.execute();
                successNotifier.send("✅ 작업 성공: " + task.getName());
            } catch (Exception e) {
                System.out.println("❌ 예외 발생: " + e.getMessage());
                failureNotifier.send("🚨 작업 실패: " + task.getName());
            }
        }
    }
}
