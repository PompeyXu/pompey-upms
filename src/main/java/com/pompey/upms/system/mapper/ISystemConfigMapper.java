package com.pompey.upms.system.mapper;


import org.apache.ibatis.annotations.Mapper;
import com.pompey.upms.system.model.SystemConfigVo;
import tk.mybatis.mapper.common.BaseMapper;

/**
* 参数配置表Mapper
* @author PompeyXu
* @date 2019-04-11 23:20:20
 */
@Mapper
public interface ISystemConfigMapper extends BaseMapper<SystemConfigVo>{
	
}
