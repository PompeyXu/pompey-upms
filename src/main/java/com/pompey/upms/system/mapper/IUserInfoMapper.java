package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.pompey.upms.system.bean.UserInfo;

import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface IUserInfoMapper extends BaseMapper<UserInfo>{

	public UserInfo getUserInfoById(@Param("id") int id);
	
	public int insert(UserInfo userInfo);
}
