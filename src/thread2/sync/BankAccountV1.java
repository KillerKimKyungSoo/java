package thread2.sync;
import static utility.ThreadUtils.*;
import static utility.MyLogger.*;
public class BankAccountV1 implements BankAccount{
    private int balance;

    public BankAccountV1(int balance) {
        this.balance = balance;
    }
    @Override
    public boolean withdraw(int amount) {
        log("거래시작 : " + getClass().getSimpleName());
        log("검증시작 출금액 : " + amount + ", 잔액 : " + balance);
        if(balance < amount){
            log("검증실패 출금액 : "+ amount + ", 잔액 :" + balance);
            return false;
        }
        log("검증완료 출금액 : "+ amount + ", 잔액 :" + balance);
        sleep(1000);
        balance = balance-amount;
        log("출금완료 출금액 : " + amount + ", 잔액 : " + balance);
        log("거래종료");
        return true;
    }
    @Override
    public int getBalance(){
        return balance;
    }
}
