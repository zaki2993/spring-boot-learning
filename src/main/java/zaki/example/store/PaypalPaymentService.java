package zaki.example.store;
public class PaypalPaymentService implements PaymentService{
    @Override
    public void process(double amount){
        System.out.println("Paypal");
        System.out.println("amount: "+amount);
    }
}
