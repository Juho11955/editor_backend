package com.post.dev.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignInDTO {

    private String memberEmail;
    private String memberPassword;

}
