package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.pompey.upms.system.model.DictTypeVo;
import tk.mybatis.mapper.common.BaseMapper;

/**
* 字典类型表Mapper
* @author PompeyXu
* @date 2019-04-11 23:18:44
 */
@Mapper
public interface IDictTypeMapper extends BaseMapper<DictTypeVo>{
	
}
