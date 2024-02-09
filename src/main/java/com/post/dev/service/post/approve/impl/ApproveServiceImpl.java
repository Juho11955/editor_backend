package com.post.dev.service.post.approve.impl;

import com.post.dev.DTO.ApproveListDTO;
import com.post.dev.service.post.approve.ApproveService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ApproveServiceImpl implements ApproveService {

    @Override
    public List<ApproveListDTO> approveList(int listNum) {
        return null;
    }

    @Override
    public ApproveListDTO approvePost(int approveSeq) {
        return null;
    }

    @Override
    public String approve(Map<String, String> approveMessage) {
        return null;
    }
}
