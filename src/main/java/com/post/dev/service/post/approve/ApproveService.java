package com.post.dev.service.post.approve;

import com.post.dev.DTO.ApproveListDTO;

import java.util.List;
import java.util.Map;

public interface ApproveService {

    public List<ApproveListDTO> approveList(int listNum);

    public ApproveListDTO approvePost(int approveSeq);

    public String approve(Map<String, String> approveMessage);

}
