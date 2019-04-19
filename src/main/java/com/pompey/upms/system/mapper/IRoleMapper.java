package com.pompey.upms.system.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.pompey.upms.common.mapper.PompeyMapper;
import com.pompey.upms.system.model.RoleVo;

/**
* 角色表Mapper
* @author PompeyXu
* @date 2019-04-11 23:17:39
 */
@Mapper
public interface IRoleMapper extends PompeyMapper<RoleVo>{
	
}
