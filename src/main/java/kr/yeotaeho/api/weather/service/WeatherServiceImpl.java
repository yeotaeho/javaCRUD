package kr.yeotaeho.api.weather.service;

import org.springframework.stereotype.Service;

import kr.yeotaeho.api.weather.repository.WeatherRepository;
import kr.yeotaeho.api.weather.domain.WeatherDTO;
import kr.yeotaeho.api.common.domain.Messenger;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {
    private final WeatherRepository weatherRepository;

    public Messenger saveWeather(List<WeatherDTO> weatherList) {

        System.out.println("========================================");
        System.out.println("Service: " + weatherList.size() + "개의 날씨 데이터를 Repository로 전달");
        System.out.println("========================================\n");

        // WeatherRepository로 데이터 전달
        Messenger messenger = weatherRepository.saveAll(weatherList);

        return messenger;
    }

    @Override
    public Messenger save(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Messenger saveAll(List<WeatherDTO> weatherList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public Messenger findAll(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Messenger findById(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Messenger update(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Messenger delete(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
