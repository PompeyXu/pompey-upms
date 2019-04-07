package com.pompey.upms.system.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pompey.upms.common.service.impl.BaseServiceImpl;
import com.pompey.upms.system.bean.UserInfo;
import com.pompey.upms.system.mapper.IUserInfoMapper;
import com.pompey.upms.system.service.IUserInfoService;

@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfo> implements IUserInfoService {
	private final static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
	
	@Autowired
	private IUserInfoMapper userinfoMapper;

	@Override
	public UserInfo getUserInfoById(int id) {
		return userinfoMapper.getUserInfoById(id);
	}

	@Override
	public int insert(UserInfo userInfo) {
		return userinfoMapper.insert(userInfo);
	}

	@Override
	public PageInfo<UserInfo> getList() {
		final PageInfo<UserInfo> pageInfo = PageHelper.startPage(1, 10).setOrderBy("id desc").doSelectPageInfo(() -> this.userinfoMapper.selectAll());
		
//		 PageHelper.startPage(1, 10).setOrderBy("id desc");
//	     final PageInfo<UserInfo> userPageInfo = new PageInfo<>(this.userinfoMapper.selectAll());
//	     logger.info("[普通写法] - [{}]", userPageInfo);
		logger.info(pageInfo.toString());
		return pageInfo;
		
		
	}
	
	
	
	
}
