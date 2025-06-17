package june17day.ex1;

import java.util.Arrays;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier("admin@example.com");
        TaskRunner runner = new TaskRunner(notifier);
        List<Task> taskList = Arrays.asList(
                new Task("데이터베이스 "),
                new Task("로그 파일 정리 "),
                new Task("사용자통계 ")
        );

        runner.runTask(taskList);
    }
}
