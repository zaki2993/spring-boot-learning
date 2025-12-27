package zaki.example.store;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HavyResources{
    HavyResources(){
        System.out.println("HavyResources created");
    }
}
