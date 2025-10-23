package kr.yeotaeho.api.user.repository;

import org.springframework.stereotype.Repository;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.user.domain.UserDTO;
import kr.yeotaeho.api.user.service.UserService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    public Messenger saveAll(List<UserDTO> userDTO) {
        System.out.println("========================================");
        System.out.println("Repository: " + userDTO.size() + "명의 사용자 데이터 저장 완료");
        System.out.println("========================================\n");

        for (int i = 0; i < userDTO.size(); i++) {
            UserDTO user = userDTO.get(i);

            System.out.println("--- 승객 " + (i + 1) + " ---");
            System.out.println("PassengerId: " + user.getUserId());
            System.out.println("Survived: " + user.getSurvived());
            System.out.println("Pclass: " + user.getPclass());
            System.out.println("Name: " + user.getName());
            System.out.println("Sex: " + user.getGender());
            System.out.println("Age: " + user.getAge());
            System.out.println("SibSp: " + user.getSibSp());
            System.out.println("Parch: " + user.getParch());
            System.out.println("Ticket: " + user.getTicket());
            System.out.println("Fare: " + user.getFare());
            System.out.println("Cabin: " + user.getCabin());
            System.out.println("Embarked: " + user.getEmbarked());
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("출력 완료");
        System.out.println("========================================\n");

        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage(userDTO.size() + "명의 사용자가 저장되었습니다.");
        return messenger;
    }


    public Messenger save(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }


    public Messenger findAll(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }


    public Messenger findById(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public Messenger update(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public Messenger delete(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
