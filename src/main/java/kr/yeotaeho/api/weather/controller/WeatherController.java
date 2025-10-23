package kr.yeotaeho.api.weather.controller;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.nio.charset.StandardCharsets;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.ui.Model;
import kr.yeotaeho.api.weather.domain.WeatherDTO;
import kr.yeotaeho.api.weather.service.WeatherService;
import kr.yeotaeho.api.common.domain.Messenger;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/weather/load")
    @ResponseBody
    public Messenger loadWeatherData(Model model) {

        String csvFilePath = "src/main/resources/static/scv/TRAIN_weather.csv-Grid view.csv";

        List<WeatherDTO> weatherList = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(csvFilePath);
                Reader reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
                CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreSurroundingSpaces().withTrim())) {

            for (CSVRecord record : csvParser) {

                WeatherDTO weather = new WeatherDTO();

                // CSV 컬럼 인덱스로 접근 (BOM 문제 회피)
                // 0:일시, 1:평균기온(℃), 2:최고기온(℃), 3:최고기온시각, 4:최저기온(℃), 5:최저기온시각, 6:일교차, 7:강수량(mm)
                weather.setCity(record.get(0)); // 일시
                weather.setWeather(record.get(1)); // 평균기온(℃)
                weather.setTemperature(record.get(2)); // 최고기온(℃)
                weather.setHumidity(record.get(3)); // 최고기온시각
                weather.setWindSpeed(record.get(4)); // 최저기온(℃)
                weather.setPrecipitation(record.get(5)); // 최저기온시각
                weather.setDate(record.get(6)); // 일교차
                weather.setTime(record.get(7)); // 강수량(mm)

                weatherList.add(weather);
            }

            // WeatherService로 데이터 전달
            Messenger messenger = weatherService.saveWeather(weatherList);
            model.addAttribute("weatherList", weatherList);
            return messenger;
        } catch (Exception e) {
            Messenger messenger = new Messenger();
            messenger.setCode(500);
            messenger.setMessage("CSV 파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            return messenger;
        }
    }
}
