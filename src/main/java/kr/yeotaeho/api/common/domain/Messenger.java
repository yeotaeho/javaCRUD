package kr.yeotaeho.api.common.domain;

import java.util.List;

import kr.yeotaeho.api.user.domain.UserDTO;

public class Messenger {
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(List<UserDTO> allUserData) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setData'");
    }
}
