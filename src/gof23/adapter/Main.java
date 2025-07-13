package gof23.adapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrisntBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
