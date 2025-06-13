package june13day;

public class UndoAction extends ButtonAction{
    @Override
    protected void exexute() {
        System.out.println("이전작업을 돌렸습니다");
    }
}
