package kr.yeotaeho.api.calculator.service;

import kr.yeotaeho.api.calculator.domain.CalculatorDTO;

public interface CalculatorService {
   public int add(CalculatorDTO calculatorDTO);

   public int minus(CalculatorDTO calculatorDTO);

   public int multiply(CalculatorDTO calculatorDTO);

   public int divide(CalculatorDTO calculatorDTO);
}
