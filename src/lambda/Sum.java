package lambda;

public class Sum implements Procedure{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i= :" +i );
        }
    }
}
