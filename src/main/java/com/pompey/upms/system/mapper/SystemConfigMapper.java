package com.pompey.upms.system.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pompey.upms.system.entity.SystemConfigVo;

/**
* 参数配置表Mapper
* @author PompeyXu
* @date 2019-04-11 23:20:20
 */
@Mapper
public interface SystemConfigMapper extends BaseMapper<SystemConfigVo>{
	
}
