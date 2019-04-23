package com.pompey.upms.system.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pompey.upms.system.entity.Role;
import com.pompey.upms.system.mapper.RoleMapper;
import com.pompey.upms.system.service.IRoleService;

/**
 * 角色表Service
 * 
 * @author PompeyXu
 * @date 2019-04-11 23:17:39  
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
