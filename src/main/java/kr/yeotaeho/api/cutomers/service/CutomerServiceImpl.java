package kr.yeotaeho.api.cutomers.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.cutomers.domain.CutomerDTO;
import kr.yeotaeho.api.cutomers.repository.CutomerRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CutomerServiceImpl implements CutomerService {

    private final CutomerRepository cutomerRepository;

    @Override
    public Messenger save(CutomerDTO cutomerDTO, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Messenger saveAll(List<CutomerDTO> cutomerDTO, Model model) {
        System.out.println("========================================");
        System.out.println("Service: " + cutomerDTO.size() + "명의 고객 데이터를 Repository로 전달");
        System.out.println("========================================\n");

        // CutomerRepository로 데이터 전달
        Messenger messenger = cutomerRepository.saveAll(cutomerDTO, model);

        return messenger;
    }

    @Override
    public Messenger update(CutomerDTO cutomerDTO, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Messenger delete(String id, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Messenger findById(String id, Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Messenger findAll(Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
