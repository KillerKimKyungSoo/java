package thread.test.executor;

import java.util.concurrent.Callable;

public class RandomSleepTask implements Callable<String> {
    private final String name;

    public RandomSleepTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
       int sleepTime =(int)(Math.random()*3000 );
        System.out.println(name + " 시작 예상시간 " + sleepTime + "ms");
        Thread.sleep(sleepTime);
        return name + "완료 ( 실제 : " + sleepTime + "ms)";
    }
}
