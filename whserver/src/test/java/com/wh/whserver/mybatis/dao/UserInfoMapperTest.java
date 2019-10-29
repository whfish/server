package com.wh.whserver.mybatis.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.wh.whserver.mybatis.pojo.UserInfo;

@RunWith(SpringRunner.class)
// @SpringBootTest
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserInfoMapperTest {
	@Autowired
	private UserInfoMapper userinfomap;

	// @Test
	// @Rollback(false)
	public void testInsertSelective() {
		UserInfo user = new UserInfo();
		// user.setId(11);
		user.setUsername("wh");
		user.setPassword("wh123");

		int index = userinfomap.insertSelective(user);
		Assert.assertEquals(index, 2);

	}

	@Test
	@Rollback(false)
	public void testInsert() {
		UserInfo user = new UserInfo();
		// user.setId(10);
		user.setUsername("admin");
		user.setPassword("123");
		user.setDetail("测试账号2");
		userinfomap.insert(user);
		int index = user.getId();
		Assert.assertEquals(index, 2);

	}

}
