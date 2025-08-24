package review.nested.anonymous;

import review.nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar=3;
    public void process(int paramVar){
        int localVar=1;
        Printer printer = new Printer() {
            int value=0;
            @Override
            public void print() {
                System.out.println(value);
                System.out.println(localVar);
                System.out.println(paramVar);
                System.out.println(outInstanceVar);
            }
        };
        printer.print();
        System.out.println(printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
