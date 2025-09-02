package thread2.bounded.example;

public class TryLockExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        for (int i =1 ; i<=5 ; i++){
            String threadName = "스레드 - " +i;
            String docName ="문서 - " + i;
            new Thread(() -> printer.printDocument(docName, threadName)).start();
        }
    }
}
