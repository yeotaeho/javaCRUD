package kr.yeotaeho.api.products.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kr.yeotaeho.api.products.repository.ProductsRepository;
import kr.yeotaeho.api.products.domain.ProductsDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {

    private final ProductsRepository productsRepository;

    @Override
    public String save(ProductsDTO productsDTO, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public String update(ProductsDTO productsDTO, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public String delete(String id, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public String findById(String id, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public String findAll(Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public String saveAll(List<ProductsDTO> productsDTO, Model model) {
        System.out.println("========================================");
        System.out.println("Service: " + productsDTO.size() + "개의 제품 데이터를 Repository로 전달");
        System.out.println("========================================\n");

        // ProductsRepository로 데이터 전달
        String result = productsRepository.saveAll(productsDTO, model);

        return result;
    }
}