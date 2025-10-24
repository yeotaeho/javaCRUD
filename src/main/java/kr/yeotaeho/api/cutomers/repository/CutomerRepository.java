package kr.yeotaeho.api.cutomers.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.cutomers.domain.CutomerDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CutomerRepository {

    public Messenger saveAll(List<CutomerDTO> cutomerDTO, Model model) {
        System.out.println("========================================");
        System.out.println("Repository: " + cutomerDTO.size() + "명의 고객 데이터 저장 완료");
        System.out.println("========================================\n");

        for (int i = 0; i < cutomerDTO.size(); i++) {
            CutomerDTO customer = cutomerDTO.get(i);

            System.out.println("--- 고객 " + (i + 1) + " ---");
            System.out.println("Index: " + customer.getIndex());
            System.out.println("Customer ID: " + customer.getCustomerId());
            System.out.println("Name: " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Company: " + customer.getCompany());
            System.out.println("City: " + customer.getCity());
            System.out.println("Country: " + customer.getCountry());
            System.out.println("Phone 1: " + customer.getPhone1());
            System.out.println("Phone 2: " + customer.getPhone2());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Subscription Date: " + customer.getSubscriptionDate());
            System.out.println("Website: " + customer.getWebsite());
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("터미널 출력 완료");
        System.out.println("========================================\n");

        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage(cutomerDTO.size() + "명의 고객 데이터가 저장되었습니다.");
        model.addAttribute("messenger", messenger);
        model.addAttribute("customers", cutomerDTO);

        return messenger;
    }

    public Messenger save(CutomerDTO cutomerDTO, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public Messenger update(CutomerDTO cutomerDTO, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public Messenger delete(String id, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public Messenger findById(String id, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public Messenger findAll(Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
