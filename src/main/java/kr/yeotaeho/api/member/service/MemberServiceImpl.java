package kr.yeotaeho.api.member.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.member.domain.MemberDTO;
import kr.yeotaeho.api.member.reository.MenberReository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class MemberServiceImpl implements MenberService {
    private final MenberReository menberReository;
    
    @Override
    public Messenger save(MemberDTO memberDTO ,Model model) {
        return menberReository.save(memberDTO);
    }

    @Override
    public Messenger delete(String id ,Model model) {
        return menberReository.delete(id);
    }

    @Override
    public Messenger findById(MemberDTO memberDTO ,Model model) {
        return menberReository.findById(memberDTO);
    }

    @Override
    public Messenger update(MemberDTO memberDTO ,Model model) {
        return menberReository.update(memberDTO);
    }

    @Override
    public Messenger findAll(Model model) {
        return menberReository.findAll(model);
    }


    
}
