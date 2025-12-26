package zaki.example.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationMessage implements NotificationMessage{
    @Override
    public void sendMessage(String message){
        System.out.println("email message send");
    }
}
