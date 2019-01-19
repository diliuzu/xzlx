package com.xzlx.web.api.dao;

import com.xzlx.web.api.web.dto.TbCommentDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TbCommentDAO {
    List<TbCommentDTO> selectTravelComment(@Param("travelId")int travelId, @Param("start")int start,@Param("length") int length);

    Integer selectTravelCommentCounts(Integer travelId);
}
