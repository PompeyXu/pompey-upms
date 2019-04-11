package com.pompey.upms.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pompey.upms.common.service.impl.BaseServiceImpl;
import com.pompey.upms.system.mapper.IDictDataMapper;
import com.pompey.upms.system.model.DictDataVo;
import com.pompey.upms.system.service.IDictDataService;

/**
* 字典数据表Service
* @author PompeyXu
* @date 2019-04-11 23:19:19
 */
@Service
public class DictDataServiceImpl extends BaseServiceImpl<DictDataVo> implements IDictDataService{
	
	@Autowired
	private IDictDataMapper mapper;
	

}
