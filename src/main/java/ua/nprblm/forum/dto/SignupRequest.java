package ua.nprblm.forum.dto;

import lombok.Data;

@Data
public class SignupRequest {

    private String name;
    private String email;
    private String phone;
    private String password;

}
