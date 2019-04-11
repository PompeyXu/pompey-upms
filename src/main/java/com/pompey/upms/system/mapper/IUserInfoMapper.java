package com.pompey.upms.system.mapper;


import org.apache.ibatis.annotations.Mapper;
import com.pompey.upms.system.model.UserInfoVo;
import tk.mybatis.mapper.common.BaseMapper;

/**
* 用户表Mapper
* @author PompeyXu
* @date 2019-04-08 23:49:37
 */
@Mapper
public interface IUserInfoMapper extends BaseMapper<UserInfoVo>{
	
}
