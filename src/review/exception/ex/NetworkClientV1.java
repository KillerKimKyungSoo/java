package review.exception.ex;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }
    public String connect(){
        if(connectError){
            System.out.println(address + " 서버연결 실패");
            return "connectError";
        }
        System.out.println(address + " 서버연결 성공");
        return  "success";
    }
    public String send(String data){
        if(sendError){
            System.out.println(address + " 서버데이터 전송실패 " + data);
            return "send Error";
        }
        System.out.println(address + " 서버에 데이터 전송 " + data);
        return  "success";
    }
    public void disConnect(){
        System.out.println(address + " 서버연결 해제");
    }
    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        }
        if(data.contains("error2")){
            sendError=true;
        }
    }
}
