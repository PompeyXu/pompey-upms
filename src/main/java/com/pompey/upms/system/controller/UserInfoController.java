package com.pompey.upms.system.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.common.result.ResultEnum;
import com.pompey.upms.common.result.ResultInfo;
import com.pompey.upms.system.entity.UserInfo;
import com.pompey.upms.system.service.impl.UserInfoServiceImpl;

import io.swagger.annotations.Api;

/**
 * 用户信息controller
 * 
 * @author PompeyXu
 * @date 2019-04-20 19:53
 *
 */
@Api(value = "用户管理", tags = { "用户操作接口" })
@RestController
@RequestMapping("/user")
public class UserInfoController extends BaseController<UserInfo, UserInfoServiceImpl> {


	@PostMapping(value = "/login")
	public ResultInfo<Object> login(){
		Map<String, Object> data = new HashMap<String, Object>(16);
		data.put("token", "admin-token");
		
		return ResultInfo.success(data, ResultEnum.SUCCESS.getMsg());
	}

	@GetMapping(value = "/info")
	public ResultInfo<Object> info() {
		Map<String, Object> data = new HashMap<String, Object>(16);
		data.put("token", "admin-token");
		
		return ResultInfo.success(data, ResultEnum.SUCCESS.getMsg());
	}
	
}
