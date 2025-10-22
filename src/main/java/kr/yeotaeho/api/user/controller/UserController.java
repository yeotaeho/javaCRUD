package kr.yeotaeho.api.user.controller;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.yeotaeho.api.user.service.UserService;
import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.user.domain.UserDTO;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/register")
    public String printFirstFivePassengers(Model model) {

        String csvFilePath = "src/main/resources/static/scv/train.csv";

        List<UserDTO> users = new ArrayList<>();

        try (Reader reader = new FileReader(csvFilePath);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            // CSV 파일 경로
            int count = 0;

            // 처음 5명의 데이터만 읽기
            for (CSVRecord record : csvParser) {
                if (count >= 5)
                    break;

                UserDTO user = new UserDTO();
                user.setUserId(record.get("PassengerId"));
                user.setSurvived(record.get("Survived"));
                user.setPclass(record.get("Pclass"));
                user.setName(record.get("Name"));
                user.setGender(record.get("Sex"));
                user.setAge(record.get("Age"));
                user.setSibSp(record.get("SibSp"));
                user.setParch(record.get("Parch"));
                user.setTicket(record.get("Ticket"));
                user.setFare(record.get("Fare"));
                user.setCabin(record.get("Cabin"));
                user.setEmbarked(record.get("Embarked"));

                users.add(user);
                count++;
            }

            // 응답 메시지 생성
            Messenger messenger = userService.saveUser(users);

            model.addAttribute("users", users);
            model.addAttribute("messenger", messenger);
            return "user/list";

        } catch (Exception e) {
            Messenger messenger = new Messenger();
            messenger.setCode(500);
            messenger.setMessage("CSV 파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            return "user/list";
        }

    }

}