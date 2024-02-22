package com.post.dev.service.signIn.impl;

import com.post.dev.DTO.SignInDTO;
import com.post.dev.entity.Member;
import com.post.dev.repository.MemberRepository;
import com.post.dev.service.signIn.SignInService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SignInServiceImpl implements SignInService {

    private final MemberRepository memberRepository;

    //로그인
    public Member signIn(SignInDTO signInDTO){
        Optional<Member> memberOptional = memberRepository.findByEmail(signInDTO.getMemberEmail());

        //로그인 이메일과 일치하는 Member가 없을 경우
        if(memberOptional.isEmpty()){
            return null;
        }

        Member member = memberOptional.get();

        //비밀번호가 일치하지 않을 경우
        if(!member.getMemberPassword().equals(signInDTO.getMemberPassword())){
            return null;
        }

        return member;
    }

    public Member getMemberByEmail(String memberEmail) {
        if(memberEmail == null){
            return null;
        }

        Optional<Member> optionalMember = memberRepository.findByEmail(memberEmail);
        if(optionalMember.isEmpty()){
            return null;
        }

        return optionalMember.get();
    }
}
