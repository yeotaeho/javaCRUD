package kr.yeotaeho.api.products.controller;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.yeotaeho.api.products.domain.ProductsDTO;
import kr.yeotaeho.api.products.service.ProductsServiceImpl;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductsController {

    private final ProductsServiceImpl productsService;


    @PostMapping("")
    public String save(ProductsDTO productsDTO, Model model) {
        productsService.save(productsDTO, model);
        return "products/products";
    }

    @PostMapping("/all")
    public String saveAll(Model model) {
        String csvFilePath = "src/main/resources/static/scv/products-100.csv";

        List<ProductsDTO> products = new ArrayList<>();

        try (Reader reader = new FileReader(csvFilePath);
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {

            int count = 0;

            // 처음 5개의 제품 데이터만 읽기
            for (CSVRecord record : csvParser) {
                if (count >= 5)
                    break;

                ProductsDTO product = new ProductsDTO();
                product.setIndex(record.get("Index"));
                product.setName(record.get("Name"));
                product.setDescription(record.get("Description"));
                product.setBrand(record.get("Brand"));
                product.setCategory(record.get("Category"));
                product.setPrice(record.get("Price"));
                product.setCurrency(record.get("Currency"));
                product.setStock(record.get("Stock"));
                product.setEAN(record.get("EAN"));
                product.setColor(record.get("Color"));
                product.setSize(record.get("Size"));
                product.setAvailability(record.get("Availability"));
                product.setInternal_ID(record.get("Internal ID"));

                products.add(product);
                count++;
            }

            // Service로 데이터 전달
            productsService.saveAll(products, model);

            return "products/products";

        } catch (Exception e) {
            model.addAttribute("error", "CSV 파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            return "products/products";
        }
    }

    @PutMapping("/{id}")
    public String update(ProductsDTO productsDTO, Model model) {
        productsService.update(productsDTO, model);
        return "products/products";
    }

    @DeleteMapping("/{id}")
    public String delete(String id, Model model) {
        productsService.delete(id, model);
        return "products/products";
    }

    @GetMapping("/id/{id}")
    public String findById(String id, Model model) {
        productsService.findById(id, model);
        return "products/products";
    }

    @GetMapping("/all")
    public String findAll(Model model) {
        productsService.findAll(model);
        return "products/products";
    }

}
