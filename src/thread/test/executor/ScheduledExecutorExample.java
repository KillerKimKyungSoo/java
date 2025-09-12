package thread.test.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.schedule(()->{
            System.out.println("3초 뒤에 한번실행된 : " + Thread.currentThread().getName());
        },3, TimeUnit.SECONDS );

        scheduledExecutorService.scheduleAtFixedRate(()->{
            System.out.println("scheduleAtFixedRate -현재시간 :" + System.currentTimeMillis());
        },2,5,TimeUnit.SECONDS );

        scheduledExecutorService.scheduleWithFixedDelay(()->
        {
            System.out.println("schedualWithFixedDelay - 시작 : " + System.currentTimeMillis());
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("schedualWithFixedDelay - 종료 :" + System.currentTimeMillis());
        } ,2,5,TimeUnit.SECONDS );
        scheduledExecutorService.schedule(()->{
            System.out.println("스케줄러 종료");
        }, 30,TimeUnit.SECONDS);
    }
}
