package zaki.example.store;

import java.util.List;
import org.springframework.beans.factory.annotation.Value; // 1. Added Import
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// @Service("stripe")
// @Primary
public class StripePaymentService implements PaymentService{
    @Value("${stripe.url}")
    private String stripeUrl;
    @Value("${stripe.enabled}")
    private boolean stripeEnabled;
    @Value("${stripe.supported-currencies}")
    private List<String> stripeSupportedCurrency;
    @Override
    public void process(double amount){
        System.out.println("Stripe");
        System.out.println("amount: "+amount);
        System.out.println("url: "+stripeUrl);
        System.out.println("stripeEnabled: "+stripeEnabled);
        System.out.println("supported cur: "+stripeSupportedCurrency.get(0));
    }
}
