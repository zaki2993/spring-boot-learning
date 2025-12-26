package zaki.example.store;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotificationMessage implements NotificationMessage{
    @Override
    public void sendMessage(String message){
        System.out.println("sms message sent");
    }
} 
