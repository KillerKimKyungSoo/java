package review.exception.ex;

public class NetworkServiceV1_1 {
    public void sendMessage(String data){
        String address ="http://example.comm";
        NetworkClientV1 clientV1 = new NetworkClientV1(address);
        clientV1.initError(data);
        clientV1.connect();
        clientV1.send(data);
        clientV1.disConnect();
    }
}
