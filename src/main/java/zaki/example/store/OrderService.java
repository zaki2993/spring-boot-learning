package zaki.example.store;
public class OrderService{
    private PaymentService paymentService;
    public OrderService(){}
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void process(){
        paymentService.process(111);
    }
    public void setPaymentService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
}
