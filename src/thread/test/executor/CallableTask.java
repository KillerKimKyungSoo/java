package thread.test.executor;

import java.util.concurrent.Callable;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class CallableTask implements Callable<Integer> {
    private String name;
    private int sleepMS =1000;

    public CallableTask(String name) {
        this.name = name;
    }

    public CallableTask(String name, int sleepMS) {
        this.name = name;
        this.sleepMS = sleepMS;
    }

    @Override
    public Integer call() throws Exception {
        log(name + "실행");
        sleep(sleepMS);
        log(name+ "완료 , return = " + sleepMS);
        return sleepMS;
    }
}
