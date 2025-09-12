package thread.test.executor;

import java.util.Random;
import java.util.concurrent.Callable;

public class ServerCheckTask implements Callable<Boolean> {
    private final String servername;
    private final Random random = new Random();

    public ServerCheckTask(String servername) {
        this.servername = servername;
    }

    @Override
    public Boolean call() throws Exception {
        boolean isAlive = random.nextInt(100)>=30;
        if(isAlive){
            System.out.println(servername + " 상태양호 ");
        }else {
            System.out.println(servername+ "응답없음 ");
        }
        return isAlive;
    }
    public String getServerName() {
        return servername;
    }
}
