package com.pompey.upms.system.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pompey.upms.system.entity.Organization;
import com.pompey.upms.system.mapper.OrganizationMapper;
import com.pompey.upms.system.service.IOrganizationService;

/**
 * 公司表Service
 * 
 * @author PompeyXu
 * @date 2019-04-11 23:30:06  
 */
@Service
public class OrganizationServiceImpl extends ServiceImpl<OrganizationMapper, Organization> implements IOrganizationService {

}
