package june13day.samplee2;

public class OrderContext {
    private OrderStatus status = null;
    public void setStatus(OrderStatus status){
        this.status = status;
        System.out.println("📦 [상태 변경] 현재 주문 상태: " + status);
    }
    public OrderStatus getStatus(){
        return status;
    }

}
