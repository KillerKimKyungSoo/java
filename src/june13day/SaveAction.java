package june13day;

public class SaveAction extends ButtonAction{
    @Override
    protected void exexute() {
        System.out.println("저장작업이 수행 되었습니다");
    }
    @Override
    public void onDoubleClick() {
        System.out.println("저장을 두 번 클릭했습니다. 백업 저장 시작.");
    }
}
