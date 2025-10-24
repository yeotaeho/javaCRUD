package kr.yeotaeho.api.products.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@NoArgsConstructor // 기본 생성자 자동 생성
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자 자동 생성
public class ProductsVO {
    private String name;
    private String description;
    private String brand;
    private String category;
    private String price;
    private String currency;
    private String stock;
    private String ean;
    private String color;
    private String size;
    private String availability;
    
}
