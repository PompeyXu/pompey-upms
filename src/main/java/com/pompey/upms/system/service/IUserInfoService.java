package com.pompey.upms.system.service;

import com.github.pagehelper.PageInfo;
import com.pompey.upms.common.service.IBaseService;
import com.pompey.upms.system.bean.UserInfo;

public interface IUserInfoService extends IBaseService<UserInfo>{

	public PageInfo<UserInfo> getList();
	
	public UserInfo getUserInfoById(int id);
	
	public int insert(UserInfo userInfo);
}
