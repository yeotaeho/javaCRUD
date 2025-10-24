package kr.yeotaeho.api.cutomers.controller;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.cutomers.domain.CutomerDTO;
import kr.yeotaeho.api.cutomers.service.CutomerServiceImpl;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CutomerController {

    private final CutomerServiceImpl cutomerService;

    @GetMapping("")
    public String customerPage() {
        return "customers/customers";
    }

    @PostMapping("")
    public String saveAll(Model model) {
        String csvFilePath = "src/main/resources/static/scv/customers-1000.csv";

        List<CutomerDTO> customers = new ArrayList<>();

        try (Reader reader = new FileReader(csvFilePath);
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {

            int count = 0;

            // 처음 5개의 고객 데이터만 읽기
            for (CSVRecord record : csvParser) {
                if (count >= 5)
                    break;

                CutomerDTO customer = new CutomerDTO();
                customer.setIndex(record.get("Index"));
                customer.setCustomerId(record.get("Customer Id"));
                customer.setFirstName(record.get("First Name"));
                customer.setLastName(record.get("Last Name"));
                customer.setCompany(record.get("Company"));
                customer.setCity(record.get("City"));
                customer.setCountry(record.get("Country"));
                customer.setPhone1(record.get("Phone 1"));
                customer.setPhone2(record.get("Phone 2"));
                customer.setEmail(record.get("Email"));
                customer.setSubscriptionDate(record.get("Subscription Date"));
                customer.setWebsite(record.get("Website"));

                customers.add(customer);
                count++;
            }

            // Service로 데이터 전달
            cutomerService.saveAll(customers, model);

            return "customers/customers";

        } catch (Exception e) {
            Messenger messenger = new Messenger();
            messenger.setCode(500);
            messenger.setMessage("CSV 파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            model.addAttribute("messenger", messenger);
            return "customers/customers";
        }
    }
}
