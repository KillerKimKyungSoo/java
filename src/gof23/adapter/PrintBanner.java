package gof23.adapter;

public class PrintBanner extends PrintA{
    private Banner banner;
    public PrintBanner (String string){
        this.banner=new Banner(string);
    }
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWihtAseter();
    }
}
