package com.xzlx.web.api.web.dto;

import com.xzlx.domain.TbUser;
import lombok.Data;

@Data
public class TbCommentDTO {

    private String content;

    private String created;

    private Integer satisfy;

    private UserDto tbUser;

}
@Data
class UserDto{
    private Long id;
    private String nickname;
    private String photo;
}