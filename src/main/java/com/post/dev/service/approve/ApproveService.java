package com.post.dev.service.approve;

import com.post.dev.DTO.ApproveListDTO;

import java.util.Map;

public interface ApproveService {

    public ApproveListDTO approveList(int listNum);

    public ApproveListDTO approvePost(int approveSeq);

    public String approve(Map<String, String> approveMessage);

}
