package ua.nprblm.forum.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.nprblm.forum.dto.SignupRequest;
import ua.nprblm.forum.dto.UserDTO;
import ua.nprblm.forum.service.AuthService;

@RestController
@RequiredArgsConstructor
public class SignupUserController {

    private final AuthService authService;

    @PostMapping("/sign-up")
    public ResponseEntity<?> create(@RequestBody SignupRequest signupRequest)
    {
        UserDTO createdUser = authService.createUser(signupRequest);
        if(createdUser == null)
            return new ResponseEntity<>("User is not created, try again later...", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
