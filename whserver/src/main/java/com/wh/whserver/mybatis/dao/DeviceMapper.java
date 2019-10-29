package com.wh.whserver.mybatis.dao;

import java.util.List;

import com.wh.whserver.mybatis.pojo.Device;

public interface DeviceMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Device record);

	int insertSelective(Device record);

	Device selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Device record);

	int updateByPrimaryKey(Device record);

	/**
	 * 查询全部用户
	 * 
	 * @return
	 */
	List<Device> selectAll();

	/**
	 * 分页查询用户
	 * 
	 * @return
	 */
	List<Device> selectPage();
}