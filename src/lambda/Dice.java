package lambda;

import java.util.Random;

public class Dice implements Procedure{
    @Override
    public void run() {
        int randomValue = new Random().nextInt(6) +1;
        System.out.println("주사위 : " + randomValue);
    }
}

