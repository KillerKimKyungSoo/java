package june13day.samplee2;

public class CancelOrderAction extends ButtonAction{
    public CancelOrderAction(OrderContext context) {
        super(context);
    }
    @Override
    public void olLongPress() {
        if (context.getStatus() == OrderStatus.CREATED) {
            System.out.println("[취소] 주문을 취소합니다.");
            context.setStatus(OrderStatus.CANCELLED);
        } else {
            System.out.println("❌ [취소] 이미 처리된 주문은 취소할 수 없습니다. 현재 상태: " + context.getStatus());
        }
    }

    @Override
    protected void execute() {
        System.out.println("[취소] 취소 준비 중...");
    }
}
