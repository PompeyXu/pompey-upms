package com.pompey.upms.system.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pompey.upms.system.entity.SystemConfig;
import com.pompey.upms.system.mapper.SystemConfigMapper;
import com.pompey.upms.system.service.ISystemConfigService;

/**
 * 参数配置表Service
 * 
 * @author PompeyXu
 * @date 2019-04-11 23:20:20  
 */
@Service
public class SystemConfigServiceImpl extends ServiceImpl<SystemConfigMapper, SystemConfig>
		implements ISystemConfigService {

}
