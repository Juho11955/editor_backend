package com.post.dev.service.signIn;

import com.post.dev.DTO.SignInDTO;
import com.post.dev.entity.Member;

public interface SignInService {

    public Member signIn(SignInDTO signInDTO);
    public Member getMemberByEmail(String memberEmail);
}
