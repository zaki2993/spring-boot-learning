package zaki.example.store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{
    @Value("${payment-type}")
    private String paymentService; 
    @Bean
    public StripePaymentService stripe(){
        return new StripePaymentService();
    }
    @Bean
    public PaypalPaymentService paypal(){
        return new PaypalPaymentService();
    }
    @Bean
    public OrderService orderService(){
        System.out.println("kdkkddk :"+paymentService);
        if(paymentService.equals("paypal")){
            return new OrderService(paypal());
        }
        else{
            return new OrderService(stripe());
        }
    }
}
