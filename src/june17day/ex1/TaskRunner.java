package june17day.ex1;

import java.util.List;

public class TaskRunner {
    private final Notifier notifier;

    public TaskRunner(Notifier notifier) {
        this.notifier = notifier;
    }
    public void runTask(List<Task> tasks){
        for(Task task : tasks){
            task.execute();
            notifier.send("작업완료됨 :" + task.getName());
        }
    }
}
