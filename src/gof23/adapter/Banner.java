package gof23.adapter;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen(){
        System.out.println("(" + string + ")");
    }
    public void showWihtAseter(){
        System.out.println("*" + string +"*");
    }
}
