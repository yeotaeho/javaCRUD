package kr.yeotaeho.api.calculator.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data      // Getter, Setter, toString, equals, hashCode 메서드 자동 생성
@NoArgsConstructor // 기본 생성자 자동 생성
@AllArgsConstructor

public class CalculatorDTO {
    private int num1;
    private int num2;
    private String operator;
}
