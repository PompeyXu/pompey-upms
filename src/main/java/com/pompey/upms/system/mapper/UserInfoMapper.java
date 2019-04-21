package com.pompey.upms.system.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pompey.upms.system.entity.UserInfoVo;

/**
* 用户表Mapper
* @author PompeyXu
* @date 2019-04-08 23:49:37
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfoVo>{
	
}
