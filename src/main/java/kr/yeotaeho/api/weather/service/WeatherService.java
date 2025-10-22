package kr.yeotaeho.api.weather.service;

import org.springframework.stereotype.Service;

import kr.yeotaeho.api.weather.repository.WeatherRepository;
import kr.yeotaeho.api.weather.domain.WeatherDTO;
import kr.yeotaeho.api.common.domain.Messenger;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherRepository weatherRepository;

    public Messenger saveWeather(List<WeatherDTO> weatherList) {

        System.out.println("========================================");
        System.out.println("Service: " + weatherList.size() + "개의 날씨 데이터를 Repository로 전달");
        System.out.println("========================================\n");

        // WeatherRepository로 데이터 전달
        Messenger messenger = weatherRepository.saveWeatherData(weatherList);

        return messenger;
    }
}
