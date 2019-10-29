package com.wh.whserver.mybatis.dao;

import com.wh.whserver.mybatis.pojo.SysdevRelation;
import com.wh.whserver.mybatis.pojo.SysdevRelationKey;

public interface SysdevRelationMapper {
    int deleteByPrimaryKey(SysdevRelationKey key);

    int insert(SysdevRelation record);

    int insertSelective(SysdevRelation record);

    SysdevRelation selectByPrimaryKey(SysdevRelationKey key);

    int updateByPrimaryKeySelective(SysdevRelation record);

    int updateByPrimaryKey(SysdevRelation record);
}