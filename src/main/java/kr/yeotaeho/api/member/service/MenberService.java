package kr.yeotaeho.api.member.service;

import kr.yeotaeho.api.member.domain.MemberDTO;

public interface MenberService {
    public void seve(MemberDTO memberDTO);

    public void delete(MemberDTO memberDTO);

    public void findById(MemberDTO memberDTO);

    public void update(MemberDTO memberDTO);

    public void findAll(MemberDTO memberDTO);
}