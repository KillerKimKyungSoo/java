package thread.test.executor;

public class Task3 implements  Runnable{
    private   String name;

    public Task3(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("현재 실행중인 작업  : "+ name);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.err.println(name + " 작업이 인터럽트됨");
        }
        System.out.println("작업완료 : " + name);
    }
}
