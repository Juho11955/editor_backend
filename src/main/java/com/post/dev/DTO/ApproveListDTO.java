package com.post.dev.DTO;

import java.sql.Date;

public class ApproveListDTO {

    private int approveSeq;
    private String approveCategory;
    private String approveTitle;
    private String approveContents;
    private String memberSeq;
    private Date approveDate;

    public ApproveListDTO(int approveSeq) {
        this.approveSeq = approveSeq;
    }

    public ApproveListDTO(int approveSeq, String approveCategory, String approveTitle, String approveContents, String memberSeq, Date approveDate) {
        this.approveSeq = approveSeq;
        this.approveCategory = approveCategory;
        this.approveTitle = approveTitle;
        this.approveContents = approveContents;
        this.memberSeq = memberSeq;
        this.approveDate = approveDate;
    }

    public int getApproveSeq() {
        return approveSeq;
    }

    public void setApproveSeq(int approveSeq) {
        this.approveSeq = approveSeq;
    }

    public String getApproveCategory() {
        return approveCategory;
    }

    public void setApproveCategory(String approveCategory) {
        this.approveCategory = approveCategory;
    }

    public String getApproveTitle() {
        return approveTitle;
    }

    public void setApproveTitle(String approveTitle) {
        this.approveTitle = approveTitle;
    }

    public String getApproveContents() {
        return approveContents;
    }

    public void setApproveContents(String approveContents) {
        this.approveContents = approveContents;
    }

    public String getMemberSeq() {
        return memberSeq;
    }

    public void setMemberSeq(String memberSeq) {
        this.memberSeq = memberSeq;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }
}
