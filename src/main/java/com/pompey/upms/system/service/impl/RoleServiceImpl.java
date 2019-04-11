package com.pompey.upms.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pompey.upms.common.service.impl.BaseServiceImpl;
import com.pompey.upms.system.mapper.IRoleMapper;
import com.pompey.upms.system.model.RoleVo;
import com.pompey.upms.system.service.IRoleService;

/**
* 角色表Service
* @author PompeyXu
* @date 2019-04-11 23:17:39
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleVo> implements IRoleService{
	
	@Autowired
	private IRoleMapper mapper;
	

}
