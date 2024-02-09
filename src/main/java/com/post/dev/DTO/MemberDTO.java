package com.post.dev.DTO;

import com.post.dev.Enums.Approve;
import com.post.dev.Enums.MemberGrade;

import java.util.Date;

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

    public MemberDTO(int memberNum, String memberName, String memberNickname, String memberEmail, String memberPassword, String memberImage, String memberIntroduce, Date memberDate, MemberGrade memberGrade, Approve memberApprove) {
        this.memberNum = memberNum;
        this.memberName = memberName;
        this.memberNickname = memberNickname;
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberImage = memberImage;
        this.memberIntroduce = memberIntroduce;
        this.memberDate = memberDate;
        this.memberGrade = memberGrade;
        this.memberApprove = memberApprove;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberImage() {
        return memberImage;
    }

    public void setMemberImage(String memberImage) {
        this.memberImage = memberImage;
    }

    public String getMemberIntroduce() {
        return memberIntroduce;
    }

    public void setMemberIntroduce(String memberIntroduce) {
        this.memberIntroduce = memberIntroduce;
    }

    public Date getMemberDate() {
        return memberDate;
    }

    public void setMemberDate(Date memberDate) {
        this.memberDate = memberDate;
    }

    public MemberGrade getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(MemberGrade memberGrade) {
        this.memberGrade = memberGrade;
    }

    public Approve getMemberApprove() {
        return memberApprove;
    }

    public void setMemberApprove(Approve memberApprove) {
        this.memberApprove = memberApprove;
    }
}


