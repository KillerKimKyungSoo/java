package thread2.bounded.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance =1000;
    private final Lock lock = new ReentrantLock();

    public void deposit(int amount, String threadName){
        lock.lock();
        try{
            System.out.println(threadName + " - 입금시작 : " + amount);
            int newBalance = balance + amount;
            Thread.sleep(100);
            balance = newBalance;
            System.out.println(threadName + " - 입금완료: 현재 잔액 : " + balance );
        }catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void withdraw(int amount, String threadName){
        lock.lock();
        try{
            System.out.println(threadName + " - 출금시작 : " + amount);
            if(balance>=amount){
                int newBalance = balance-amount;
                Thread.sleep(100);
                balance=newBalance;
                System.out.println(threadName + " 출금완료  현재잔액 : " + balance);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


}
