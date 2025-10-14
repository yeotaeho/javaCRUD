package kr.yeotaeho.api.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @GetMapping("/auth/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        System.out.println("email = " + email);
        System.out.println("password = " + password);
    return "auth/login";
}

}