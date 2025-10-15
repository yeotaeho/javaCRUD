package kr.yeotaeho.api.auth.service;

import kr.yeotaeho.api.auth.domain.LoginDTO;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    
    public boolean login(LoginDTO loginDTO) {
        System.out.println("로그인 서비스로 들어옴");
        System.out.println("서비스로 전달된 이메일 : " + loginDTO.getEmail());
        System.out.println("서비스로 전달된 비밀번호 : " + loginDTO.getPassword());
        return true;
    }

    public boolean plus(LoginDTO loginDTO) {
        System.out.println("연산");
        System.out.println("서비스로 전달된 1번 숫자 : " + loginDTO.getNumber1());
        System.out.println("서비스로 전달된 2번 숫자 : " + loginDTO.getNumber2());
        System.out.println("합 = " + (loginDTO.getNumber1() + loginDTO.getNumber2()));
        return true;
    }

    public boolean minus(LoginDTO loginDTO) {
        System.out.println("빼기 서비스로 들어옴");
        System.out.println("서비스로 전달된 1번 숫자 : " + loginDTO.getMinusnumber1());
        System.out.println("서비스로 전달된 2번 숫자 : " + loginDTO.getMinusnumber2());
        System.out.println("빼기 = " + (loginDTO.getMinusnumber1() - loginDTO.getMinusnumber2()));
        return true;
    }

    public boolean nanum(LoginDTO loginDTO) {
        System.out.println("나누기 서비스로 들어옴");
        System.out.println("서비스로 전달된 1번 숫자 : " + loginDTO.getNanumnumber1());
        System.out.println("서비스로 전달된 2번 숫자 : " + loginDTO.getNanumnumber2());
        System.out.println("나누기 = " + (loginDTO.getNanumnumber1() / loginDTO.getNanumnumber2()));
        return true;
    }

    public boolean gob(LoginDTO loginDTO) {
        System.out.println("곱하기 서비스로 들어옴");
        System.out.println("서비스로 전달된 1번 숫자 : " + loginDTO.getGobnumber1());
        System.out.println("서비스로 전달된 2번 숫자 : " + loginDTO.getGobnumber2());
        System.out.println("곱하기 = " + (loginDTO.getGobnumber1() * loginDTO.getGobnumber2()));
        return true;
    }

    

}
