package zaki.example.store;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
@Controller
public class HomeController{
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
    @RequestMapping("/settings")
    public String settings(){
        return "settings.html";
    }
}
