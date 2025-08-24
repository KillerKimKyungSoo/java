package review.nested.ex1;

public class NetWorkMessage {
    private String content;
    public NetWorkMessage(String content){
        this.content=content;
    }
    public void print(){
        System.out.println(content);
    }
}
