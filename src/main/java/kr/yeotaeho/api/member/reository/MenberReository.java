package kr.yeotaeho.api.member.reository;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.member.domain.MemberDTO;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class MenberReository {

    
    public Messenger save(MemberDTO memberDTO) {
     Messenger messenger = new Messenger();
     messenger.setCode(0);
     messenger.setMessage("저장 성공");
     return messenger;
    }

    
    public Messenger delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    
    public Messenger findById(MemberDTO memberDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    
    public Messenger update(MemberDTO memberDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    
    public Messenger findAll(Model model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

   
}
