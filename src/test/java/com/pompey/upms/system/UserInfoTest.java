package com.pompey.upms.system;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pompey.upms.system.entity.Demo;
import com.pompey.upms.system.service.IDemoService;

/**
 * 用户测试类
 * @author PompeyXu
 * @since 2019-04-23 23:39
 *
 */
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
		Demo info = new Demo();
		info.setResourceId("1");
		info.setLoginAccount("zhangsan");
		info.setUserName("张三");
		info.setPassword("123456");
		userInfoService.insert(info);
	}

	@Test
	public void testGetList() {
		IPage<Demo> page = userInfoService.page(new Page<>(1, 10));

		System.out.println(page);
	}

	@Test
	public void testDeleteId() {
//		System.out.println(userInfoService.delete("1"));
	}

}
