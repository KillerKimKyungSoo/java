package thread2.bounded.example;

public class TryLockRetryExample {
    public static void main(String[] args) {
        PrinterWithRetry printer = new PrinterWithRetry();
        for (int i = 1; i <=5; i++) {
            String threadName = " 스레드 " + i;
            String docNAme =" 문서 "+i;
            new Thread(() -> printer.printDocument(docNAme,threadName)).start();
        }
    }
}
