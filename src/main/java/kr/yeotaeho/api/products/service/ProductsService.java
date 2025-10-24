package kr.yeotaeho.api.products.service;

import java.util.List;

import org.springframework.ui.Model;

import kr.yeotaeho.api.products.domain.ProductsDTO;

public interface ProductsService {
    public String save(ProductsDTO productsDTO, Model model);
    public String saveAll(List<ProductsDTO> productsDTO, Model model);
    public String update(ProductsDTO productsDTO, Model model);
    public String delete(String id, Model model);
    public String findById(String id, Model model);
    public String findAll(Model model);
}
