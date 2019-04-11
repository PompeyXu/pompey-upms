package com.pompey.upms.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pompey.upms.system.mapper.IMenuMapper;
import com.pompey.upms.common.service.impl.BaseServiceImpl;
import com.pompey.upms.system.model.MenuVo;
import com.pompey.upms.system.service.IMenuService;

/**
* 菜单表Service
* @author PompeyXu
* @date 2019-04-11 23:18:03
 */
@Service
public class MenuServiceImpl extends BaseServiceImpl<MenuVo> implements IMenuService{
	
	@Autowired
	private IMenuMapper mapper;
	
}
