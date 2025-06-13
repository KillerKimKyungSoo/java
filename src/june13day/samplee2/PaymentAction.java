package june13day.samplee2;

public class PaymentAction extends ButtonAction{
    private PaymentProcessor processor = new PaymentProcessor();
    public PaymentAction(OrderContext context) {
        super(context);
    }

    @Override
    public void onDoubleClick() {
        if (context.getStatus() == OrderStatus.CREATED) {
            System.out.println("[결제] 결제를 시도합니다...");
            if (processor.process()) {
                context.setStatus(OrderStatus.PAID);
            } else {
                System.out.println("⚠️ 결제 실패로 상태 변경 없음.");
            }
        } else {
            System.out.println("❌ [결제] 결제를 진행할 수 없습니다. 주문 상태: " + context.getStatus());
        }
    }

    @Override
    protected void execute() {
        System.out.println("기본결제 준비중.......");
    }


}
