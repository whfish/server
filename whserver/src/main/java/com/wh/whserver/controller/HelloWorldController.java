package com.wh.whserver.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wh.whserver.mybatis.dao.UserInfoMapper;
import com.wh.whserver.mybatis.pojo.UserInfo;

@RestController
public class HelloWorldController {
	private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

	@Autowired
	private UserInfoMapper userinfomap;

	@RequestMapping("/test")
	public String test() {

		LOG.info("test");

		return "test";
	}

	@RequestMapping("/add")
	public String add() {
		UserInfo user = new UserInfo();
		user.setId(1);
		user.setUsername("wh");
		user.setPassword("wh123");

		userinfomap.insertSelective(user);
		return "添加成功：";
	}

	@RequestMapping("/query")
	public String query() {
		// Device device = new Device();
		// device.setIp("129.6.4.5");
		// device.setDesc("测试服务器");
		// List<Device> result = deviceDao.getAll();
		// StringBuilder sb = new StringBuilder();
		// for (Device d : result) {
		// sb.append(d.getIp()).append("\n").append(d.getDesc()).append("<br>");
		// }
		// System.out.println(sb.toString());

		return "";
	}

	@RequestMapping("/upload")
	public void upload(HttpServletRequest request, HttpServletResponse response) {
		try {
			Part part = request.getPart("logo");
			InputStream input = part.getInputStream();

			File tagDir = new File(request.getSession().getServletContext().getRealPath("/upload"));
			if (!tagDir.exists()) {
				tagDir.mkdir();
			}

			String realFileName = part.getSubmittedFileName();
			OutputStream output = new FileOutputStream(new File(tagDir, realFileName));

			byte[] buff = new byte[8192];
			int len = input.read(buff);
			while (len != -1) {
				output.write(buff, 0, len);
				len = input.read(buff);
			}

			input.close();
			output.close();
			response.setCharacterEncoding("utf-8");
			response.getWriter().print("upload success!!");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
