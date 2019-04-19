package com.pompey.upms.system.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.pompey.upms.common.mapper.PompeyMapper;
import com.pompey.upms.system.model.UserInfoVo;

/**
* 用户表Mapper
* @author PompeyXu
* @date 2019-04-08 23:49:37
 */
@Mapper
public interface IUserInfoMapper extends PompeyMapper<UserInfoVo>{
	
}
