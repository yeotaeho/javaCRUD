package kr.yeotaeho.api.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.member.domain.MemberDTO;
import kr.yeotaeho.api.member.service.MenberService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MenberService menberService;

    @PostMapping("")
    public String save(@RequestBody MemberDTO memberDTO ,Model model) {
        Messenger messenger = menberService.save(memberDTO, model);
        model.addAttribute("messenger", messenger);
        return "member/membersave";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id ,Model model) {
        Messenger messenger = menberService.delete(id, model);
        model.addAttribute("messenger", messenger);
        return "member/memberdelete";
    }

    @GetMapping("/id/{id}")
    public void findById(@PathVariable String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @PutMapping("/{id}")
    public void update(@RequestBody MemberDTO memberDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @GetMapping("/all")
    public String findAll(Model model) {
        Messenger messenger = menberService.findAll(model);
        model.addAttribute("messenger", messenger);
        return "member/memberlist";
        
    }

 
    
}
