package lambda;

import java.util.Random;

public class Ex1RefMainV2 {
    public static void hello(Procedure procedure){
        long startNs = System.nanoTime();
        procedure.run();
        long endNs = System.nanoTime();
        System.out.println("실행시간 :"+ (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
        Procedure dice = new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 : " +  randomValue);
            }
        };
        Procedure sum = new Procedure() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("I = " + i);
                }
            }
        };
        hello(dice);
        hello(sum);
    }

}
