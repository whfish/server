package com.wh.whserver.mybatis.pojo;

import java.util.Date;

public class DevmtRelation extends DevmtRelationKey {
    private Integer userId;

    private Date opttime;

    private Integer weight;

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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}