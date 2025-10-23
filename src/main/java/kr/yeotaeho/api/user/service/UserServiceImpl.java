package kr.yeotaeho.api.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.user.domain.UserDTO;

@Service
public class UserServiceImpl implements UserService {

    // 메모리에 사용자 데이터 저장
    private List<UserDTO> userDataStore = new ArrayList<>();

    @Override
    public Messenger save(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Messenger saveAll(List<UserDTO> users) {
        System.out.println("========================================");
        System.out.println("UserService: " + users.size() + "개의 사용자 데이터 저장 완료");
        System.out.println("========================================\n");

        // 메모리에 저장
        userDataStore.clear(); // 기존 데이터 제거
        userDataStore.addAll(users);

        for (int i = 0; i < users.size(); i++) {
            UserDTO user = users.get(i);
            System.out.println("--- 사용자 데이터 " + (i + 1) + " ---");
            System.out.println("사용자 ID: " + user.getUserId());
            System.out.println("이름: " + user.getName());
            System.out.println("성별: " + user.getGender());
            System.out.println("나이: " + user.getAge());
            System.out.println();
        }

        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage(users.size() + "개의 사용자 데이터가 저장되었습니다.");
        return messenger;
    }

    @Override
    public Messenger findAll(UserDTO userDTO) {
        Messenger messenger = new Messenger();
        List<UserDTO> allUserData = new ArrayList<>(userDataStore);
        messenger.setCode(200);
        messenger.setMessage("사용자 데이터 조회 성공");
        messenger.setData(allUserData);
        return messenger;
    }

    @Override
    public Messenger findById(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Messenger update(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Messenger delete(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
