package kr.yeotaeho.api.member.service;

import org.springframework.ui.Model;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.member.domain.MemberDTO;

public interface MenberService {
    public Messenger save(MemberDTO memberDTO ,Model model);

    public Messenger delete(String id ,Model model);

    public Messenger findById(MemberDTO memberDTO ,Model model);

    public Messenger update(MemberDTO memberDTO ,Model model);

    public Messenger findAll(Model model);
}