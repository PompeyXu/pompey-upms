package com.pompey.upms.system.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.common.result.ResultEnum;
import com.pompey.upms.common.result.ResultInfo;
import com.pompey.upms.system.entity.UserInfoVo;
import com.pompey.upms.system.service.impl.UserInfoServiceImpl;

/**
 * 用户信息controller
 * 
 * @author PompeyXu
 * @date 2019-04-20 19:53
 *
 */
@RestController
@RequestMapping("/user")
public class UserInfoController extends BaseController<UserInfoVo, UserInfoServiceImpl> {

	@GetMapping("/pagelist/{page}/{pageSize}")
	public ResultInfo<Object> list(@PathVariable("page") int page, @PathVariable("pageSize") int pageSize,
			UserInfoVo userInfo) {
		QueryWrapper<UserInfoVo> query = new QueryWrapper<>();
		query.lambda()
				.eq(StringUtils.isNotBlank(userInfo.getUserName()), UserInfoVo::getUserName, userInfo.getUserName())
				.eq(StringUtils.isNotBlank(userInfo.getPassword()), UserInfoVo::getPassword, userInfo.getPassword());
		IPage<UserInfoVo> data = service.page(new Page<>(page, pageSize), query);
		return ResultInfo.success(data, ResultEnum.SUCCESS.getMsg());
	}
	
	@PostMapping("/insert")
	public ResultInfo<Object> insert(UserInfoVo userInfo){
		boolean resultStatus = service.save(userInfo);
		return new ResultInfo<Object>(resultStatus);
	}

	@PutMapping("/update/{resourceId}")
	public ResultInfo<Object> update(
			@PathVariable("resourceId") String resourceId,
			UserInfoVo userInfo){
		userInfo.setResourceId(resourceId);
		boolean resultStatus = service.updateById(userInfo);
		return new ResultInfo<Object>(resultStatus);
	}
	
	@DeleteMapping("/delete/{resourceId}")
	public ResultInfo<Object> delete(@PathVariable("resourceId") String resourceId){
		boolean resultStatus = service.removeById(resourceId);
		return new ResultInfo<Object>(resultStatus);
	}
	
	@GetMapping("/getById/{resourceId}")
	public ResultInfo<UserInfoVo> selectById(@PathVariable("resourceId") String resourceId){
		UserInfoVo resultData = service.getById(resourceId);
		return new ResultInfo<UserInfoVo>(resultData);
	} 
	
}
