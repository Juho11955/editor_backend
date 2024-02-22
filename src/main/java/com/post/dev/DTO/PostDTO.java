package com.post.dev.DTO;

import com.post.dev.Enums.Approve;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class PostDTO {

    private int postNum;
    private String postTitle;
    private String postContents;
    private String postImg;
    private Date postDate;
    private int memberNum;
    private int postApproveCount;
    private Approve postApprove;

}
