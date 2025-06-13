package june13day.samplee2;

public class Main2 {
    public static void main(String[] args) {
        OrderContext context = new OrderContext();

        Button orderBtn = new Button("btn1", "주문하기");
        Button payBtn = new Button("btn2", "결제하기");
        Button cancelBtn = new Button("btn3", "주문취소");

        orderBtn.setButtonListener(new OrderAction(context));
        payBtn.setButtonListener(new PaymentAction(context));
        cancelBtn.setButtonListener(new CancelOrderAction(context));

        // 시뮬레이션
        orderBtn.click();
        payBtn.doubleClick();
        cancelBtn.longPress(); // 이미 결제된 경우 취소 안됨
    }
}
