package june13day.samplee2;

public class Button {
    private final String id;
    private final String label;
    private ButtonListener listener;

    public Button(String id, String label) {
        this.id = id;
        this.label = label;
    }

    public void setButtonListener(ButtonListener listener){
        this.listener = listener;
    }
    public void click(){
        System.out.println("🔘 [" + label + "] 클릭됨");
        if(listener != null){
            listener.onClick();
        }
    }
    public void doubleClick() {
        System.out.println("🖱️ [" + label + "] 더블클릭됨");
        if (listener != null) {
            listener.onDoubleClick();
        }
    }

    public void longPress() {
        System.out.println("⏱️ [" + label + "] 롱프레스됨");
        if (listener != null) {
            listener.olLongPress();
        }
    }

}
