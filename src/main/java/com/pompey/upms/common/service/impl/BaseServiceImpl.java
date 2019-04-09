package com.pompey.upms.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.pompey.upms.common.service.IBaseService;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @ClassName: BaseServiceImpl
 * @Description: 基础service实现 
 * @author PompeyXu
 * @date: 2019-04-09 21:39
 *
 * @param <T>
 */
public class BaseServiceImpl<T> implements IBaseService<T> {

	@Autowired
	private BaseMapper<T> baseMapper;
	
	@Override
	public T getById(String resourceId) {
		return baseMapper.selectByPrimaryKey(resourceId);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public int update(T t) {
		return baseMapper.updateByPrimaryKeySelective(t);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public int save(T t) {
		return baseMapper.insert(t);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public int delete(String resourceId) {
		return baseMapper.delete(baseMapper.selectByPrimaryKey(resourceId));
	}

	
}
