package ua.nprblm.forum.service;

import ua.nprblm.forum.dto.SignupRequest;
import ua.nprblm.forum.dto.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupRequest signupRequest);
}
