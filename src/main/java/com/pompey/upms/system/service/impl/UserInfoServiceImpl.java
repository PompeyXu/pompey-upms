package com.pompey.upms.system.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pompey.upms.system.mapper.IUserInfoMapper;
import com.pompey.upms.common.service.impl.BaseServiceImpl;
import com.pompey.upms.system.model.UserInfoVo;
import com.pompey.upms.system.service.IUserInfoService;

/**
* 用户表Service
* @author PompeyXu
* @date 2019-04-08 23:49:37
 */
@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfoVo> implements IUserInfoService{
	
	@Autowired
	private IUserInfoMapper mapper;
	

}
