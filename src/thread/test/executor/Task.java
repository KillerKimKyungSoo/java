package thread.test.executor;

public class Task implements Runnable{
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" 실행중 " + name);
        try{
            System.out.println("sleep1000");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.err.println(name + " 작업이 인터럽트됨");
        }
        System.out.println(Thread.currentThread().getName() + "완료 " +  name);
    }
}
