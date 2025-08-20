package review.nested.ex1;

public class Network {
    public void seneMessage(String text){
        NetWorkMessage netWorkMessage = new NetWorkMessage(text);
        netWorkMessage.print();
    }
}
