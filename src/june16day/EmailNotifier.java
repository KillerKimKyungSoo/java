package june16day;

public class EmailNotifier extends BaseNotifier{
    public EmailNotifier(String senderName){
        super(senderName);
    }
    @Override
    public void send(String message) throws Exception {
        log(message);
        if(Math.random()<0.3) throw new Exception("이메일서버 오류");
        System.out.println("이메일 발송 : " + message);
    }
}
