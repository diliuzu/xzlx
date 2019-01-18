package com.xzlx.commons.util.persistance;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BasePageDTO implements Serializable {

    protected Integer page;

    protected Integer pageSize;

    protected Integer totalPage;


}
