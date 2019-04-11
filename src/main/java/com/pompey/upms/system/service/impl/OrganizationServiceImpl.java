package com.pompey.upms.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pompey.upms.common.service.impl.BaseServiceImpl;
import com.pompey.upms.system.mapper.IOrganizationMapper;
import com.pompey.upms.system.model.OrganizationVo;
import com.pompey.upms.system.service.IOrganizationService;

/**
* 公司表Service
* @author PompeyXu
* @date 2019-04-11 23:30:06
 */
@Service
public class OrganizationServiceImpl extends BaseServiceImpl<OrganizationVo> implements IOrganizationService{
	
	@Autowired
	private IOrganizationMapper mapper;
	
}
