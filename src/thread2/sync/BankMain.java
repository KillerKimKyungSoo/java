package thread2.sync;
import  static utility.ThreadUtils.*;
import static utility.MyLogger.*;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account =  new BankAccountV3(1000);
        Thread t1=new Thread(new WithdrawTask(account,800),"t1");
        Thread t2=new Thread(new WithdrawTask(account,800),"t2");
        t1.start();
        t2.start();
        log("t1 state : " + t1.getState());
        log("t2 state : " + t2.getState());

        t1.join();
        t2.join();

        log("최종잔액 : "+account.getBalance());
    }
}
