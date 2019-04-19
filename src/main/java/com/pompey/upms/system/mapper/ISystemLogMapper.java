package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.pompey.upms.common.mapper.PompeyMapper;
import com.pompey.upms.system.model.SystemLogVo;

/**
* 操作日志表Mapper
* @author PompeyXu
* @date 2019-04-11 23:18:25
 */
@Mapper
public interface ISystemLogMapper extends PompeyMapper<SystemLogVo>{
	
}
