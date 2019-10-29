package com.wh.whserver.mybatis.dao;

import com.wh.whserver.mybatis.pojo.Metrics;

public interface MetricsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Metrics record);

    int insertSelective(Metrics record);

    Metrics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Metrics record);

    int updateByPrimaryKey(Metrics record);
}