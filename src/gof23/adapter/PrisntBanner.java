package gof23.adapter;

public class PrisntBanner extends Banner implements  Print{
    public PrisntBanner(String string){
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWihtAseter();
    }
}
