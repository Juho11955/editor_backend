package com.post.dev.controller;


import com.post.dev.DTO.PostDTO;
import com.post.dev.Enums.Result;
import com.post.dev.service.post.posting.PostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostingController {

    @Autowired
    private PostingService postingService;

    @GetMapping(value = "approveList", produces = "application/json; charset=utf8")
    @ResponseBody
    public Result approveList(@RequestParam("postDTO") PostDTO postDTO) {
        return postingService.postingWrite(postDTO);
    }





}
