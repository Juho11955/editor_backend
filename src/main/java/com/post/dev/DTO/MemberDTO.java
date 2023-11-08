package com.post.dev.DTO;

public class MemberDTO {

    private int memberSeq;
    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberSns;
    private int memberGrade;

    public MemberDTO(int memberSeq) {
        this.memberSeq = memberSeq;
    }

    public MemberDTO(int memberSeq, String memberId, String memberPw, String memberName, String memberSns, int memberGrade) {
        this.memberSeq = memberSeq;
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
        this.memberSns = memberSns;
        this.memberGrade = memberGrade;
    }

    public int getMemberSeq() {
        return memberSeq;
    }

    public void setMemberSeq(int memberSeq) {
        this.memberSeq = memberSeq;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberSns() {
        return memberSns;
    }

    public void setMemberSns(String memberSns) {
        this.memberSns = memberSns;
    }

    public int getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(int memberGrade) {
        this.memberGrade = memberGrade;
    }
}


