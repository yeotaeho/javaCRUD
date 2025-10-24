package kr.yeotaeho.api.cutomers.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.cutomers.domain.CutomerDTO;

@Service
public interface CutomerService {
    public Messenger save(CutomerDTO cutomerDTO, Model model);

    public Messenger saveAll(List<CutomerDTO> cutomerDTO, Model model);

    public Messenger update(CutomerDTO cutomerDTO, Model model);

    public Messenger delete(String id, Model model);

    public Messenger findById(String id, Model model);

    public Messenger findAll(Model model);
}
