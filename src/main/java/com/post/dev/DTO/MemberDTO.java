package com.post.dev.DTO;

import com.post.dev.Enums.Approve;
import com.post.dev.Enums.MemberGrade;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class MemberDTO {

    private int memberNum;
    private String memberName;
    private String memberNickname;
    private String memberEmail;
    private String memberPassword;
    private String memberImage;
    private String memberIntroduce;
    private Date memberDate;
    private MemberGrade memberGrade;
    private Approve memberApprove;

}


