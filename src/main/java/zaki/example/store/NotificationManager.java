package zaki.example.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class NotificationManager{
    private final NotificationMessage notificationMessage;
    @Autowired
    NotificationManager(@Qualifier("sms") NotificationMessage notificationMessage){
        this.notificationMessage=notificationMessage;
    }
    public void manageMessage(){
        notificationMessage.sendMessage("zaki");

    }
}
