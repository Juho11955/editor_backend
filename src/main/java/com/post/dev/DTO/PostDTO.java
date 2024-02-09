package com.post.dev.DTO;

import com.post.dev.Enums.Approve;

import java.util.Date;

public class PostDTO {

    private int postNum;
    private String postTitle;
    private String postContents;
    private String postImg;
    private Date postDate;
    private int memberNum;
    private int postApproveCount;
    private Approve postApprove;

    public PostDTO(int postNum, String postTitle, String postContents, String postImg, Date postDate, int memberNum, int postApproveCount, Approve postApprove) {
        this.postNum = postNum;
        this.postTitle = postTitle;
        this.postContents = postContents;
        this.postImg = postImg;
        this.postDate = postDate;
        this.memberNum = memberNum;
        this.postApproveCount = postApproveCount;
        this.postApprove = postApprove;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContents() {
        return postContents;
    }

    public void setPostContents(String postContents) {
        this.postContents = postContents;
    }

    public String getPostImg() {
        return postImg;
    }

    public void setPostImg(String postImg) {
        this.postImg = postImg;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    public int getPostApproveCount() {
        return postApproveCount;
    }

    public void setPostApproveCount(int postApproveCount) {
        this.postApproveCount = postApproveCount;
    }

    public Approve getPostApprove() {
        return postApprove;
    }

    public void setPostApprove(Approve postApprove) {
        this.postApprove = postApprove;
    }
}
