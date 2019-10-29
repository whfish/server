package com.wh.whserver.mybatis.dao;

import com.wh.whserver.mybatis.pojo.DevmtRelation;
import com.wh.whserver.mybatis.pojo.DevmtRelationKey;

public interface DevmtRelationMapper {
    int deleteByPrimaryKey(DevmtRelationKey key);

    int insert(DevmtRelation record);

    int insertSelective(DevmtRelation record);

    DevmtRelation selectByPrimaryKey(DevmtRelationKey key);

    int updateByPrimaryKeySelective(DevmtRelation record);

    int updateByPrimaryKey(DevmtRelation record);
}