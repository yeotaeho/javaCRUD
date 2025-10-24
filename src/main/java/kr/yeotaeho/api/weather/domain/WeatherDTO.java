package kr.yeotaeho.api.weather.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data            // Getter, Setter, toString, equals, hashCode 메서드 자동 생성
@NoArgsConstructor // 기본 생성자 자동 생성
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자 자동 생성

public class WeatherDTO {
    private String city;
    private String weather;
    private String temperature;
    private String humidity;
    private String windSpeed;
    private String precipitation;
    private String date;
    private String time;
}
