package com.pompey.upms.system.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.pompey.upms.common.mapper.PompeyMapper;
import com.pompey.upms.system.model.SystemConfigVo;

/**
* 参数配置表Mapper
* @author PompeyXu
* @date 2019-04-11 23:20:20
 */
@Mapper
public interface ISystemConfigMapper extends PompeyMapper<SystemConfigVo>{
	
}
