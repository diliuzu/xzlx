package com.xzlx.web.api.service.impl;

import com.xzlx.commons.util.persistance.BasePageDTO;
import com.xzlx.domain.TbHotel;
import com.xzlx.web.api.dao.TbCommentDAO;
import com.xzlx.web.api.service.TbCommentService;
import com.xzlx.web.api.web.dto.TbCommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.stream.events.Comment;

@Service
@Transactional(readOnly = true)
public class TbCommentServiceImpl implements TbCommentService {

    @Autowired
    TbCommentDAO tbCommentDAO;

    @Override
    public BasePageDTO<TbCommentDTO> getTravelComment(Integer travelId, BasePageDTO<TbCommentDTO> basePageDTO) {
        int start=(basePageDTO.getPage()-1)*basePageDTO.getPageSize();
        int length=basePageDTO.getPageSize();
        basePageDTO.setEntity(tbCommentDAO.selectTravelComment(travelId,start,length));
        basePageDTO.setTotalPage(tbCommentDAO.selectTravelCommentCounts(travelId));

        return basePageDTO;
    }
}
