package com.post.dev.controller;

import com.post.dev.DTO.SignInDTO;
import com.post.dev.entity.Member;
import com.post.dev.service.signIn.SignInService;
import com.post.dev.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SignInController {

    private final SignInService signInService;

    @PostMapping("/signIn")
    public String signIn(@RequestBody SignInDTO signInDTO){

        Member member = signInService.signIn(signInDTO);

        if(member == null){
            return "아이디 또는 비밀번호가 일치하지 않습니다.";
        }

        String secretKey = "aglkajepoghdlkfhmbiosembbnsdlffvnoeaiehrapoenhjkdfbnlksdfmnalnoaweureghpruiperhwqpoieioggpdfbnjkdjvb";
        long expireTime = 1000*60*60;

        String Jwt = JwtUtil.GenerateToken(member.getMemberEmail(), secretKey, expireTime);

        return Jwt;
    }
}
