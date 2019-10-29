package com.wh.whserver.mybatis.dao;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wh.whserver.mybatis.pojo.Device;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeviceMapperTest {
	@Autowired
	private DeviceMapper dm;

	@Test
	public void testInsert() {
		Device dev = new Device();
		// user.setId(10);
		Random ra = new Random();
		for (int i = 0; i < 20; i++) {
			int index = ra.nextInt(255);
			dev.setIp("10.2.1." + index);
			dev.setDevName("test" + index);
			dev.setUserId(22);
			dm.insert(dev);
		}

	}

	@Test
	public void testSelectAll() {

	}

	@Test
	public void testSelectPage() {
		int pageNum = 0;
		int pageSize = 5;

		PageHelper.startPage(pageNum, pageSize);
		List<Device> lists = dm.selectPage();

		System.out.println(new PageInfo<Device>(lists));
	}

}
