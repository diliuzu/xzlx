package com.xzlx.web.api.web.dto;

import com.xzlx.domain.TbUser;
import lombok.Data;

@Data
public class TbCommentDTO {



    private Long id;

    private String content;

    private String created;

    private Integer satisfy;

    private UserDto tbUser;

    public void setUserDto(Long id){
        if (tbUser==null)
            tbUser=new UserDto();
        tbUser.setId(id);
    }
}
@Data
class UserDto{
    private Long id;
    private String nickname;
    private String photo;
}