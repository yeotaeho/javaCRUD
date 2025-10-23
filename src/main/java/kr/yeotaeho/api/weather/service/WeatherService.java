package kr.yeotaeho.api.weather.service;

import java.util.List;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.weather.domain.WeatherDTO;

public interface WeatherService {

    public Messenger save(WeatherDTO weatherDTO);

    public Messenger saveAll(List<WeatherDTO> weatherList);

    public Messenger findAll(WeatherDTO weatherDTO);

    public Messenger findById(WeatherDTO weatherDTO);

    public Messenger update(WeatherDTO weatherDTO);

    public Messenger delete(WeatherDTO weatherDTO);
}
