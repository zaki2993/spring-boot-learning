package zaki.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; // Correct Import

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        // Use 'var' so you don't worry about imports
        var context = SpringApplication.run(StoreApplication.class, args);
        
        // Get the bean (Make sure OrderService uses @Qualifier("paypal") inside!)
        var orderService = context.getBean(OrderService.class);
        // 
        orderService.process();
        // var res = context.getBean(HavyResources.class);

        // var notificationmanager = context.getBean(NotificationManager.class);
        // notificationmanager.manageMessage();
        



    }
}
