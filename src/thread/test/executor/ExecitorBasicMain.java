package thread.test.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ExecitorBasicMain {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(2,2,0, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        log("초기상태");
        es.execute(new RunableTask("TaskA"));
        es.execute(new RunableTask("TaskB"));
        es.execute(new RunableTask("TaskC"));
        es.execute(new RunableTask("TaskD"));
        log("==작업 수행중 ==");
        sleep(3000);
        log("===작업수행 완료 ====");
        es.close();
        log("===shutdown 완료 ===");
    }
}
