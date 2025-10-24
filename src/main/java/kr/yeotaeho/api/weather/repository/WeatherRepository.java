package kr.yeotaeho.api.weather.repository;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.weather.domain.WeatherDTO;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class WeatherRepository {

    public Messenger saveAll(List<WeatherDTO> weatherDTO ,Model model) {
        System.out.println("========================================");
        System.out.println("Repository: " + weatherDTO.size() + "개의 날씨 데이터 저장 완료");
        System.out.println("========================================\n");

        for (int i = 0; i < weatherDTO.size(); i++) {
            WeatherDTO weather = weatherDTO.get(i);

            System.out.println("--- 날씨 데이터 " + (i + 1) + " ---");
            System.out.println("도시: " + weather.getCity());
            System.out.println("날짜: " + weather.getDate());
            System.out.println("날씨: " + weather.getWeather());
            System.out.println("평균기온: " + weather.getTemperature() + "℃");
            System.out.println("습도: " + weather.getHumidity());
            System.out.println("풍속: " + weather.getWindSpeed());
            System.out.println("강수량: " + weather.getPrecipitation() + "mm");
            System.out.println("시간: " + weather.getTime());
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("출력 완료");
        System.out.println("========================================\n");

        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage(weatherDTO.size() + "개의 날씨 데이터가 저장되었습니다.");
        model.addAttribute("messenger", messenger);
        model.addAttribute("weatherDTO", weatherDTO);
        return messenger;
    }

    public Messenger update(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public Messenger delete(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public Messenger findById(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public Messenger findAll(List<WeatherDTO> weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
