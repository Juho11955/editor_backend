package com.post.dev.service.post.posting.impl;

import com.post.dev.DTO.PostDTO;
import com.post.dev.Enums.Result;
import com.post.dev.service.post.posting.PostingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostingServiceImpl implements PostingService {

    // 포스팅 저장
    @Override
    public Result postingWrite(PostDTO postDTO) {
        return null;
    }

    // 포스팅 리스트 조회
    @Override
    public List<PostDTO> postingList(int pageNum) {
        return null;
    }

    // 포스팅 조회
    @Override
    public PostDTO postingPost(int postNum) {
        return null;
    }

    // 포스팅 삭제
    @Override
    public Result postingDelete(int postNum) {
        return null;
    }

    // 포스팅 수정
    @Override
    public Result postingModify(int postNum) {
        return null;
    }

}
