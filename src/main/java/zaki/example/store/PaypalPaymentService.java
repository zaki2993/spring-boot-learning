package zaki.example.store;

import org.springframework.stereotype.Service;

@Service("paypal")
public class PaypalPaymentService implements PaymentService{
    @Override
    public void process(double amount){
        System.out.println("Paypal");
        System.out.println("amount: "+amount);
    }
}
