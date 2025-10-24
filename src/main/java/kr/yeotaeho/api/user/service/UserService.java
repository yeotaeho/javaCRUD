package kr.yeotaeho.api.user.service;

import java.util.List;

import org.springframework.ui.Model;

import kr.yeotaeho.api.common.domain.Messenger;
import kr.yeotaeho.api.user.domain.UserDTO;

public interface UserService {
    public Messenger save(UserDTO userDTO);

    public Messenger saveAll(List<UserDTO> userDTO, Model model);

    public Messenger update(UserDTO userDTO);

    public Messenger delete(UserDTO userDTO);

    public Messenger findById(String id);

    public Messenger findAll();
}
