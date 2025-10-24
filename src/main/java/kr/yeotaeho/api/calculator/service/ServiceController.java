package kr.yeotaeho.api.calculator.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ServiceController {
    @GetMapping("/contents/calculator/calculator")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operator) {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("operator: " + operator);
        if (operator.equals("plus")) {
            System.out.println("num1 + num2: " + (num1 + num2));
        } else if (operator.equals("minus")) {
            System.out.println("num1 - num2: " + (num1 - num2));
        } else if (operator.equals("gob")) {
            System.out.println("num1 * num2: " + (num1 * num2));
        } else if (operator.equals("nanum")) {
            System.out.println("num1 / num2: " + (num1 / num2));
        }
        return "calculator/calculator";
    }

    @GetMapping("/contents/calculator/calculator.html")
    public String calculateHTML() {
        return "calculator/calculator";
    }

}
