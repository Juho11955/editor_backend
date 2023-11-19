package com.post.dev.controller;

import com.post.dev.DTO.SignInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {

    @PostMapping("/user/signIn")
    public String signIn(SignInDTO signInDTO){
        return null;
    }
}
