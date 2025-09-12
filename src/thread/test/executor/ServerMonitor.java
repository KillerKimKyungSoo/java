package thread.test.executor;

import java.util.Random;

public class ServerMonitor {
    private final String serverName;
    private int failureCount=0;
    private final int maxFailures =3;
    private final Random random = new Random();

    public ServerMonitor(String serverName) {
        this.serverName = serverName;
    }

    public void checkStatus(){
        boolean isAlive = simulatePing();
        if (isAlive) {
            System.out.println(serverName + " 상태양호");
            failureCount=0;
        }else{
            failureCount++;
            System.err.println(serverName + "응답없음 연속실패 "+ failureCount);
            if(failureCount>=maxFailures){
                sendAlert();
                failureCount=0;
            }
        }
    }
    private boolean simulatePing(){
        return random.nextInt(100)>=30;
    }
    private void sendAlert(){
        System.out.println("Alert: " + serverName + " 서버에 연속장애 발생");
    }
}
