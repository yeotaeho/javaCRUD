package kr.yeotaeho.api.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.yeotaeho.api.auth.domain.LoginDTO;
import kr.yeotaeho.api.auth.service.LoginService;

@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/contents/calculator/plus")
    public String plus(@RequestParam int number1,
            @RequestParam int number2) {

        System.out.println("컨트롤러로 들어옴");
        System.out.println("컨트롤러로 전달된 1번 숫자 : " + number1);
        System.out.println("컨트롤러로 전달된 2번 숫자 : " + number2);
        System.out.println("합 = " + (number1 + number2));
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.number1(number1);
        loginDTO.number2(number2);
        loginService.plus(loginDTO);

        return "calculator/plus";
    }

    @GetMapping("/contents/calculator/minus")
    public String minus(@RequestParam int minusnumber1,
            @RequestParam int minusnumber2) {

        System.out.println("컨트롤러로 들어옴");
        System.out.println("컨트롤러로 전달된 1번 숫자 : " + minusnumber1);
        System.out.println("컨트롤러로 전달된 2번 숫자 : " + minusnumber2);
        System.out.println("빼기 = " + (minusnumber1 - minusnumber2));
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.minusnumber1(minusnumber1);
        loginDTO.minusnumber2(minusnumber2);
        loginService.minus(loginDTO);

        return "calculator/minus";
    }

    @GetMapping("/contents/calculator/nanum")
    public String nanum(@RequestParam int nanumnumber1, @RequestParam int nanumnumber2) {
        System.out.println("컨트롤러로 들어옴");
        System.out.println("컨트롤러로 전달된 1번 숫자 : " + nanumnumber1);
        System.out.println("컨트롤러로 전달된 2번 숫자 : " + nanumnumber2);
        System.out.println("나누기 = " + (nanumnumber1 / nanumnumber2));
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.nanumnumber1(nanumnumber1);
        loginDTO.nanumnumber2(nanumnumber2);
        loginService.nanum(loginDTO);

        return "calculator/nanum";
    }

    @GetMapping("/contents/calculator/gob")
    public String gob(@RequestParam int gobnumber1, @RequestParam int gobnumber2) {
        System.out.println("컨트롤러로 들어옴");
        System.out.println("컨트롤러로 전달된 1번 숫자 : " + gobnumber1);
        System.out.println("컨트롤러로 전달된 2번 숫자 : " + gobnumber2);
        System.out.println("곱하기 = " + (gobnumber1 * gobnumber2));
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.gobnumber1(gobnumber1);
        loginDTO.gobnumber2(gobnumber2);
        loginService.gob(loginDTO);

        return "calculator/gob";
    }

    @GetMapping("/auth/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        System.out.println("컨트롤러로 들어옴");
        System.out.println("컨트롤러로 전달된 이메일 : " + email);
        System.out.println("컨트롤러로 전달된 비밀번호 : " + password);
        System.out.println("email = " + email);
        System.out.println("password = " + password);
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setEmail(email);
        loginDTO.setPassword(password);
        loginService.login(loginDTO);

        return "auth/login";
    }

    @GetMapping("/auth/human")
    public String human(@RequestParam String name, @RequestParam String jumin) {
        System.out.println("컨트롤러로 들어옴");
        System.out.println("컨트롤러로 전달된 이름 : " + name);
        System.out.println("컨트롤러로 전달된 주민등록번호 : " + jumin);
        return "auth/human";
    }

}