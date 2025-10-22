package kr.yeotaeho.api.user.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import kr.yeotaeho.api.user.repository.UserRepository;
import kr.yeotaeho.api.user.domain.UserDTO;
import java.util.List;
import kr.yeotaeho.api.common.domain.Messenger;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Messenger saveUser(List<UserDTO> users) {

        Messenger messenger = userRepository.saveUsers(users);

        return messenger;
    }

}
