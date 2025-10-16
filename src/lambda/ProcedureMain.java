package lambda;

public class ProcedureMain {
    public static void main(String[] args) {
        Procedure dice = new Dice();
        Procedure sum= new Sum();
        hello(dice);
        hello(sum);
    }
    public static void hello(Procedure procedure){
        long startNs= System.nanoTime();
        procedure.run();
        long endNs = System.nanoTime();
        System.out.println("실행시간 : " + (endNs - startNs) + "ns");
    }
}
