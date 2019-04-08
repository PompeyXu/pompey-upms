package com.pompey.upms.system.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pompey.upms.common.service.impl.BaseServiceImpl;
import com.pompey.upms.system.bean.DemoVo;
import com.pompey.upms.system.mapper.IDemoMapper;
import com.pompey.upms.system.service.IDemoService;

@Service
public class DemoServiceImpl extends BaseServiceImpl<DemoVo> implements IDemoService {
	private final static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
	
	@Autowired
	private IDemoMapper userinfoMapper;

	@Override
	public DemoVo getUserInfoById(int id) {
		return userinfoMapper.getUserInfoById(id);
	}

	@Override
	public int insert(DemoVo userInfo) {
		return userinfoMapper.insert(userInfo);
	}

	@Override
	public PageInfo<DemoVo> getList() {
		final PageInfo<DemoVo> pageInfo = PageHelper.startPage(1, 10).setOrderBy("id desc").doSelectPageInfo(() -> this.userinfoMapper.selectAll());
		
//		 PageHelper.startPage(1, 10).setOrderBy("id desc");
//	     final PageInfo<UserInfo> userPageInfo = new PageInfo<>(this.userinfoMapper.selectAll());
//	     logger.info("[普通写法] - [{}]", userPageInfo);
		logger.info(pageInfo.toString());
		return pageInfo;
		
		
	}
	
	
	
	
}
