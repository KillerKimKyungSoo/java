package thread2.bounded.example;

public class LockExample {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        Thread t1 = new Thread(() -> {
            account.deposit(500,"스레드-1");
        });

        // 스레드 2: 출금
        Thread t2 = new Thread(() -> {
            account.withdraw(300, "스레드-2");
        });

        // 스레드 3: 출금
        Thread t3 = new Thread(() -> {
            account.withdraw(800, "스레드-3");
        });

        t1.start();
        t2.start();
        t3.start();


    }
}
