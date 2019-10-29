package com.wh.whserver.mybatis.pojo;

import java.util.Date;

public class SysdevRelation extends SysdevRelationKey {
    private Integer userId;

    private Date opttime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOpttime() {
        return opttime;
    }

    public void setOpttime(Date opttime) {
        this.opttime = opttime;
    }
}