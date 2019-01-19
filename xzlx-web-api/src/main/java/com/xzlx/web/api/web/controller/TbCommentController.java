package com.xzlx.web.api.web.controller;

import com.xzlx.commons.util.dto.BaseResult;
import com.xzlx.commons.util.persistance.BasePageDTO;
import com.xzlx.web.api.service.TbCommentService;
import com.xzlx.web.api.web.dto.TbCommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.events.Comment;

@RestController
@RequestMapping("comments")
public class TbCommentController {

    @Autowired
    TbCommentService tbCommentService;

    @GetMapping("/travels/{travel_id}")
    public BaseResult getTravelComment(@PathVariable(value = "travel_id")Integer travelId,BasePageDTO<TbCommentDTO> basePageDTO){

        basePageDTO=tbCommentService.getTravelComment(travelId,basePageDTO);
        BaseResult baseResult=BaseResult.success(200,"成功",basePageDTO);

        return baseResult;
    }

}
