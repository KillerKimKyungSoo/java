package june13day;

public class Button {
    private ButtonListener listener;
    public void setButtonListener(ButtonListener listener){
        this.listener=listener;
    }
    public void click(){
        if(listener != null){
            listener.onClick();
        }
        else {
            System.out.println("리스너가 설정되지 않았습니다");
        }
    }
    public void doubleClick() {
        if (listener != null) {
            listener.onDoubleClick();
        }
    }

    public void longPress() {
        if (listener != null) {
            listener.onLongPress();
        }
    }
}
