package kr.yeotaeho.api.products.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data            // Getter, Setter, toString, equals, hashCode 메서드 자동 생성
@NoArgsConstructor // 기본 생성자 자동 생성
@AllArgsConstructor
public class ProductsDTO {
    private String Index;
    private String Name;
    private String Description;
    private String Brand;
    private String Category;
    private String Price;
    private String Currency;
    private String Stock;
    private String EAN;
    private String Color;
    private String Size;
    private String Availability;
    private String Internal_ID;
}
