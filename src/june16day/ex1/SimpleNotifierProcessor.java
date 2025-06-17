package june16day.ex1;

import java.util.ArrayList;
import java.util.List;

public class SimpleNotifierProcessor {
    private final Notifier notifier;
    private final List<String> messages = new ArrayList<>();
    public SimpleNotifierProcessor(Notifier notifier){
        this.notifier=notifier;
    }
    public void addMessage(String message){
        messages.add(message);
    }
    public void processAll(){
        for(String msg : messages)
        {
            notifier.send(msg);
        }
    }
}
