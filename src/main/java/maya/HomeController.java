package maya;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("message" , "Hey there");
        return "home";
    }

    @RequestMapping("/2")
    public String page2(){
        return "two";
    }
}
