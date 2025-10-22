package kr.yeotaeho.api.auth.controller;

import org.springframework.stereotype.Controller;

import kr.yeotaeho.api.auth.service.RegisterService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RegisterController{

    private final RegisterService registerService;
     
}
