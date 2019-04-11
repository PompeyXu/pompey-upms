package com.pompey.upms.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pompey.upms.system.mapper.ISystemLogMapper;
import com.pompey.upms.common.service.impl.BaseServiceImpl;
import com.pompey.upms.system.model.SystemLogVo;
import com.pompey.upms.system.service.ISystemLogService;

/**
* 操作日志表Service
* @author PompeyXu
* @date 2019-04-11 23:18:25
 */
@Service
public class SystemLogServiceImpl extends BaseServiceImpl<SystemLogVo> implements ISystemLogService{
	
	@Autowired
	private ISystemLogMapper mapper;
	
}
