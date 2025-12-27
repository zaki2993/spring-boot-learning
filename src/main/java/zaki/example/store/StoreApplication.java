package zaki.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; // Correct Import
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        // Use 'var' so you don't worry about imports
        // ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var context = SpringApplication.run(StoreApplication.class, args);
        
        // Get the bean (Make sure OrderService uses @Qualifier("paypal") inside!)
        // var orderService = context.getBean(OrderService.class);
        // var orderService2 = context.getBean(OrderService.class);
        // 
        // orderService.process();
        // orderService2.process();
        // var res = context.getBean(HavyResources.class);

        // var notificationmanager = context.getBean(NotificationManager.class);
        // notificationmanager.manageMessage();
        context.close();

    }
}
