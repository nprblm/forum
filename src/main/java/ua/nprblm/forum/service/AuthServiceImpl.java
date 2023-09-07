package ua.nprblm.forum.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.nprblm.forum.dto.SignupRequest;
import ua.nprblm.forum.dto.UserDTO;
import ua.nprblm.forum.model.User;
import ua.nprblm.forum.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;

    @Override
    public UserDTO createUser(SignupRequest signupRequest) {
        User user = new User();
        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());
        user.setPhone(signupRequest.getPhone());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));

        User createdUser = userRepository.save(user);

        UserDTO userDTO = new UserDTO();
        userDTO.setId(createdUser.getId());
        userDTO.setEmail(createdUser.getEmail());
        userDTO.setName(createdUser.getName());
        userDTO.setPhone(createdUser.getPhone());

        return userDTO;
    }
}
