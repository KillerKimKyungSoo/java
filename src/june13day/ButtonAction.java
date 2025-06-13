package june13day;

public abstract class ButtonAction implements ButtonListener {
    @Override
    public void  onClick(){
        log();
        exexute();
    }
    protected void log(){
        System.out.println("LOG Button clicker : " + System.currentTimeMillis());
        FileLogger.log("LOG Button clicker : " + System.currentTimeMillis());
    }
    protected  abstract void exexute();
}
