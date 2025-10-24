package kr.yeotaeho.api.products.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import kr.yeotaeho.api.products.domain.ProductsDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ProductsRepository {

    public String saveAll(List<ProductsDTO> productsDTO, Model model) {
        System.out.println("========================================");
        System.out.println("Repository: " + productsDTO.size() + "개의 제품 데이터 저장 완료");
        System.out.println("========================================\n");

        for (int i = 0; i < productsDTO.size(); i++) {
            ProductsDTO product = productsDTO.get(i);

            System.out.println("--- 제품 " + (i + 1) + " ---");
            System.out.println("Index: " + product.getIndex());
            System.out.println("Name: " + product.getName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Brand: " + product.getBrand());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice() + " " + product.getCurrency());
            System.out.println("Stock: " + product.getStock());
            System.out.println("EAN: " + product.getEAN());
            System.out.println("Color: " + product.getColor());
            System.out.println("Size: " + product.getSize());
            System.out.println("Availability: " + product.getAvailability());
            System.out.println("Internal ID: " + product.getInternal_ID());
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("터미널 출력 완료");
        System.out.println("========================================\n");

        model.addAttribute("products", productsDTO);
        model.addAttribute("message", productsDTO.size() + "개의 제품이 처리되었습니다.");

        return "products/products";
    }

    public String save(ProductsDTO productsDTO, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public String update(ProductsDTO productsDTO, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public String delete(ProductsDTO productsDTO, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public String findById(ProductsDTO productsDTO, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public String findAll(Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}