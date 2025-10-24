package kr.yeotaeho.api.weather.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.weather.domain.WeatherDTO;

@Service
public interface WeatherService {
    public Messenger saveAll(List<WeatherDTO> weatherDTO, Model model);

    public Messenger update(WeatherDTO weatherDTO);

    public Messenger delete(WeatherDTO weatherDTO);

    public Messenger findById(WeatherDTO weatherDTO);

    public Messenger findAll(List<WeatherDTO> weatherDTO);
}
