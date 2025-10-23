package kr.yeotaeho.api.user.service;

import kr.yeotaeho.api.user.domain.UserDTO;
import java.util.List;
import kr.yeotaeho.api.common.domain.Messenger;

public interface UserService {
    public Messenger save(UserDTO userDTO);

    public Messenger saveAll(List<UserDTO> userDTO);

    public Messenger findAll(UserDTO userDTO);

    public Messenger findById(UserDTO userDTO);

    public Messenger update(UserDTO userDTO);

    public Messenger delete(UserDTO userDTO);

}
