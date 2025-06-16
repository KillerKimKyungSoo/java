package june16day;

public class RetryingNotifierDecorator implements Notifier{
    private final Notifier delegate;
    private final int maxRetries;
    public RetryingNotifierDecorator(Notifier delegate , int maxRetries){
        this.delegate=delegate;
        this.maxRetries =maxRetries;
    }

    @Override
    public void send(String message) throws Exception {
        int attempts = 0;
        while (attempts<= maxRetries){
            try{
                delegate.send(message);
            } catch (Exception e) {
                attempts++;
                if(attempts > maxRetries){
                    System.out.println("최대 재시도 실패" + message);
                }
                else {
                    System.out.println("재시도중 " + attempts + "--" + message);
                    Thread.sleep(1000);
                }
            }


        }
    }
}
