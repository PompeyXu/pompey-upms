package com.pompey.upms.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.pompey.upms.common.service.IBaseService;
import tk.mybatis.mapper.common.BaseMapper;

public class BaseServiceImpl<T> implements IBaseService<T> {

	@Autowired
	private BaseMapper<T> baseMapper;
	
	@Override
	public T getById(int id) {
		return baseMapper.selectByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int update(T t) {
		return baseMapper.updateByPrimaryKeySelective(t);
	}

	@Transactional
	@Override
	public int save(T t) {
		return baseMapper.insert(t);
	}

	@Transactional
	@Override
	public int delete(int id) {
		return baseMapper.delete(baseMapper.selectByPrimaryKey(id));
	}

	
}
