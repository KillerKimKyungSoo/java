package june17day.ex2;

import java.util.List;

public class MultiNotifier implements  Notifier{
    private final List<Notifier> notifiers;

    public MultiNotifier(List<Notifier> notifiers) {
        this.notifiers = notifiers;
    }

    @Override
    public void send(String message) throws Exception {
        for (Notifier notifier : notifiers) {
            notifier.send(message);
        }
    }
}
