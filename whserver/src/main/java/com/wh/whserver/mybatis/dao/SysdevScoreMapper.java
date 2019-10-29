package com.wh.whserver.mybatis.dao;

import com.wh.whserver.mybatis.pojo.SysdevScore;

public interface SysdevScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysdevScore record);

    int insertSelective(SysdevScore record);

    SysdevScore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysdevScore record);

    int updateByPrimaryKey(SysdevScore record);
}