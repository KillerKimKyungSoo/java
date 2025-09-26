package thread.test.executor;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class RunableTask implements Runnable{
    private  final String name;
    private int sleepMs = 1000;

    public RunableTask(String name) {
        this.name = name;
    }

    public RunableTask(String name, int sleepMs) {
        this.name = name;
        this.sleepMs = sleepMs;
    }

    @Override
    public void run() {
        log(name + " 시작 ");
        sleep(sleepMs);
        log(name + "완료");
    }
}
