package com.post.dev.controller;

import com.post.dev.DTO.ApproveListDTO;
import com.post.dev.service.approve.ApproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class ApproveController {

    @Autowired
    private ApproveService approveService;

    @GetMapping(value = "approveList", produces = "application/json; charset=utf8")
    @ResponseBody
    public List<ApproveListDTO> approveList(@RequestParam("listNum") int listNum) {
        return approveService.approveList(listNum);
    }

    @GetMapping(value = "approvePost", produces = "application/json; charset=utf=8")
    @ResponseBody
    public ApproveListDTO approvePost(@RequestParam("approveSeq") int approveSeq) {
        return approveService.approvePost(approveSeq);
    }

    @PostMapping(value = "approve", produces = "application/json; charset=utf8")
    @ResponseBody
    public String approve(@RequestBody Map<String, String> approveMessage) {
        return approveService.approve(approveMessage);
    }






}
