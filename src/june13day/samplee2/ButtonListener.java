package june13day.samplee2;

public interface ButtonListener {
    void onClick();
    default void onDoubleClick(){

    }
    default void olLongPress(){

    }
}
