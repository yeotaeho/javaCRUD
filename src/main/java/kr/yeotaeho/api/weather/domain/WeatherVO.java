package kr.yeotaeho.api.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@NoArgsConstructor // 기본 생성자 자동 생성
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자 자동 생성
public class WeatherVO {
    private String city;
    private String weather;
    private String temperature;
    private String humidity;
    private String windSpeed;
    private String windDirection;
    private String windGust;
    private String windChill;
    private String windChillFeelsLike;
}
