package zaki.example.store;
public class Main{
    public static void main(String[] args) {
        OrderService orderService = new OrderService(new PaypalPaymentService());
        orderService.process();
    }
}
