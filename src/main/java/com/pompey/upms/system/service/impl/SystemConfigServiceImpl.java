package com.pompey.upms.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pompey.upms.system.mapper.ISystemConfigMapper;
import com.pompey.upms.common.service.impl.BaseServiceImpl;
import com.pompey.upms.system.model.SystemConfigVo;
import com.pompey.upms.system.service.ISystemConfigService;

/**
* 参数配置表Service
* @author PompeyXu
* @date 2019-04-11 23:20:20
 */
@Service
public class SystemConfigServiceImpl extends BaseServiceImpl<SystemConfigVo> implements ISystemConfigService{
	
	@Autowired
	private ISystemConfigMapper mapper;
	

}
