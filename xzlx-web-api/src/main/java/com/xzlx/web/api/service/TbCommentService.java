package com.xzlx.web.api.service;

import com.xzlx.commons.util.persistance.BasePageDTO;
import com.xzlx.web.api.web.dto.TbCommentDTO;

public interface TbCommentService {
    BasePageDTO<TbCommentDTO> getTravelComment(Integer travelId, BasePageDTO<TbCommentDTO> basePageDTO);

}
