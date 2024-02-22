package com.post.dev.entity;

import com.post.dev.Enums.Approve;
import com.post.dev.Enums.MemberGrade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
