package kr.yeotaeho.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/auth/login.html")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/contents/calculator/plus.html")
    public String plus() {
        return "calculator/plus";
    }

    @GetMapping("/auth/user.html")
    public String user() {
        return "auth/user";
    }

    @GetMapping("/contents/calculator/minus.html")
    public String minus() {
        return "calculator/minus";
    }

    @GetMapping("/contents/calculator/gob.html")
    public String gob() {
        return "calculator/gob";
    }

    @GetMapping("/contents/calculator/nanum.html")
    public String nanum() {
        return "calculator/nanum";
    }
    


}