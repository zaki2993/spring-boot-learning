package zaki.example.store;
public class StripePaymentService implements PaymentService{
    @Override
    public void process(double amount){
        System.out.println("Stripe");
        System.out.println("amount: "+amount);
    }
}
