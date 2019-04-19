package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.pompey.upms.common.mapper.PompeyMapper;
import com.pompey.upms.system.model.DictTypeVo;

/**
* 字典类型表Mapper
* @author PompeyXu
* @date 2019-04-11 23:18:44
 */
@Mapper
public interface IDictTypeMapper extends PompeyMapper<DictTypeVo>{
	
}
