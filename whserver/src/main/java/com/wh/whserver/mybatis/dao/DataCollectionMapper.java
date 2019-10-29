package com.wh.whserver.mybatis.dao;

import com.wh.whserver.mybatis.pojo.DataCollection;

public interface DataCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataCollection record);

    int insertSelective(DataCollection record);

    DataCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DataCollection record);

    int updateByPrimaryKey(DataCollection record);
}