package june13day.samplee2;

public abstract class ButtonAction implements ButtonListener {
    protected OrderContext context;

    public ButtonAction(OrderContext context) {
        this.context = context;
    }

    @Override
    public void onClick() {
        execute();
    }
    protected abstract void execute();
}
