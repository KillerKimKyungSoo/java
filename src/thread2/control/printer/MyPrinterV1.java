package thread2.control.printer;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static utility.ThreadUtils.*;
import static utility.MyLogger.*;

public class MyPrinterV1 {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        Thread printThread = new Thread(printer,"printer");
        printThread.start();
        Scanner userInput = new Scanner(System.in);
        while (true){
            log("프린터할 문서를 입력하세요 종료(Q)");
            String input = userInput.nextLine();
            if(input.equals("Q")){
                printer.work= false;
                break;
            }
            printer.addJob(input);
        }
    }

    static class Printer implements Runnable{
        volatile boolean work = true;
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>();
        @Override
        public void run(){
            while (work){
                if(jobQueue.isEmpty()){
                    continue;
                }
                String job =jobQueue.poll();
                log("출력시작 : " + job + ", 대기문서 : " + jobQueue);
                sleep(3000);
                log("출력완료 : " + job);
            }
            log("프린터종료");
        }
        public void addJob(String input){
            jobQueue.offer(input);
        }
    }
}
