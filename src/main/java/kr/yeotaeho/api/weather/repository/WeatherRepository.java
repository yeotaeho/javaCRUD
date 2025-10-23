package kr.yeotaeho.api.weather.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.weather.domain.WeatherDTO;
import kr.yeotaeho.api.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
@RequestMapping("/weathers")
public class WeatherRepository implements WeatherService {

    // 메모리에 날씨 데이터 저장 (간단한 구현)
    private List<WeatherDTO> weatherDataStore = new ArrayList<>();

    public Messenger saveAll(List<WeatherDTO> weatherList) {
        System.out.println("========================================");
        System.out.println("Repository: " + weatherList.size() + "개의 날씨 데이터 저장 완료");
        System.out.println("========================================\n");

        // 메모리에 저장
        weatherDataStore.clear(); // 기존 데이터 제거
        weatherDataStore.addAll(weatherList);

        for (int i = 0; i < weatherList.size(); i++) {
            WeatherDTO weather = weatherList.get(i);

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
        messenger.setMessage(weatherList.size() + "개의 날씨 데이터가 저장되었습니다.");
        return messenger;
    }

    // 모든 날씨 데이터 조회
    public List<WeatherDTO> getAllWeatherData() {
        return new ArrayList<>(weatherDataStore);
    }

    public Messenger save(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public Messenger findAll(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    public Messenger findById(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public Messenger update(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public Messenger delete(WeatherDTO weatherDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
