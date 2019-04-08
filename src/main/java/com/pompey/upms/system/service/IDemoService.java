package com.pompey.upms.system.service;

import com.github.pagehelper.PageInfo;
import com.pompey.upms.common.service.IBaseService;
import com.pompey.upms.system.bean.DemoVo;

public interface IDemoService extends IBaseService<DemoVo>{

	public PageInfo<DemoVo> getList();
	
	public DemoVo getUserInfoById(int id);
	
	public int insert(DemoVo userInfo);
}
