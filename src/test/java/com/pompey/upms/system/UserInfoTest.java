package com.pompey.upms.system;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.pompey.upms.system.model.DemoVo;
import com.pompey.upms.system.service.IDemoService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserInfoTest {

	@Autowired
	private IDemoService userInfoService;
	
	@Test
	public void testGetUserInfoById() {
		System.out.println(userInfoService.getUserInfoById("1"));
	}
	
	@Test
	public void testInsert() {
		DemoVo info = new DemoVo();
		info.setResourceId("1");
		info.setLoginAccount("zhangsan");
		info.setUserName("张三");
		info.setPassword("123456");
		userInfoService.insert(info);
	}
	
	@Test
	public void testGetList() {
		userInfoService.getList();
	}
	
	@Test
	public void testDeleteId() {
		System.out.println(userInfoService.delete("1"));
	}
	
}
