package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.pompey.upms.common.mapper.PompeyMapper;
import com.pompey.upms.system.model.DictDataVo;

/**
* 字典数据表Mapper
* @author PompeyXu
* @date 2019-04-11 23:19:19
 */
@Mapper
public interface IDictDataMapper  extends PompeyMapper<DictDataVo>{
	
}
