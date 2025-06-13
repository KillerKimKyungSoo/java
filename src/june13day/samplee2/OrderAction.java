package june13day.samplee2;

public class OrderAction extends ButtonAction{
    public OrderAction(OrderContext context) {
        super(context);
    }
    @Override
    protected void execute() {
        System.out.println("주문이 생성 되었습니다");
        context.setStatus(OrderStatus.CREATED);
    }
}
