package june13day.samplee2;

import java.util.Random;

public class PaymentProcessor {
    private Random  random = new Random();
    public boolean process(){
        boolean success = random.nextBoolean();
        System.out.println(success ? "💰 결제가 성공했습니다." : "❌ 결제가 실패했습니다.");
        return success;
    }
}
