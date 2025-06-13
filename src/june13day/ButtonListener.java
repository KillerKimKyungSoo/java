package june13day;

public interface ButtonListener {
    void onClick();
    default  void onDoubleClick(){};
    default void onLongPress(){};
}
