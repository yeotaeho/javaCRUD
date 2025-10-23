package kr.yeotaeho.api.member.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import kr.yeotaeho.api.member.domain.MemberDTO;
import kr.yeotaeho.api.member.reository.MenberReository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class MemberServiceImpl implements MenberService {
    private final MenberReository menberReository;
    
    @Override
    public void seve(MemberDTO memberDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seve'");
    }

    @Override
    public void delete(MemberDTO memberDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void findById(MemberDTO memberDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void update(MemberDTO memberDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void findAll(MemberDTO memberDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }


    
}
