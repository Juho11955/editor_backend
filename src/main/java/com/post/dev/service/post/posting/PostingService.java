package com.post.dev.service.post.posting;

import com.post.dev.DTO.PostDTO;
import com.post.dev.Enums.Result;

import java.util.List;

public interface PostingService {

    // 포스팅 저장
    public Result postingWrite(PostDTO postDTO);

    // 포스팅 리스트 조회
    public List<PostDTO> postingList(int pageNum);

    // 포스팅 조회
    public PostDTO postingPost(int postNum);

    // 포스팅 삭제
    public Result postingDelete(int postNum);

    // 포스팅 수정
    public Result postingModify(int postNum);

}
