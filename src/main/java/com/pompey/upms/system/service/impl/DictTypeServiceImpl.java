package com.pompey.upms.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pompey.upms.system.mapper.IDictTypeMapper;
import com.pompey.upms.common.service.impl.BaseServiceImpl;
import com.pompey.upms.system.model.DictTypeVo;
import com.pompey.upms.system.service.IDictTypeService;

/**
* 字典类型表Service
* @author PompeyXu
* @date 2019-04-11 23:18:45
 */
@Service
public class DictTypeServiceImpl extends BaseServiceImpl<DictTypeVo> implements IDictTypeService{
	
	@Autowired
	private IDictTypeMapper mapper;

}
