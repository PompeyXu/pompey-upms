package com.pompey.upms.common.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pompey.upms.common.service.IBaseService;
import com.pompey.upms.system.model.DemoVo;

import tk.mybatis.mapper.common.BaseMapper;

/**
 * @ClassName: BaseServiceImpl
 * @Description: 基础service实现 
 * @author PompeyXu
 * @date: 2019-04-09 21:39
 * @param <T>
 */
public class BaseServiceImpl<T> implements IBaseService<T> {

	@Autowired
	private BaseMapper<T> baseMapper;
	
	/**
	 * 分页查询
	 * @param params 查询参数
	 * @param pageSize 第几页
	 * @param size 每页数据条数
	 * @return PageInfo<T> 分页数据
	 */
	@Override
	public PageInfo<T> getPageInfo(Map<String, Object> params, int pageSize, int size) {
		final PageInfo<T> pageInfo = PageHelper.startPage(pageSize, size).doSelectPageInfo(() -> this.baseMapper.selectAll());
		return pageInfo;
	}
	
	/**
	 * 通过id查詢
	 * @param resourceId 主键id
	 * @return: T 返回对象
	 */
	@Override
	public T getById(String resourceId) {
		return baseMapper.selectByPrimaryKey(resourceId);
	}

	/**
	 * 更新方法
	 * @param t 参数对象
	 * @return int 返回类型
	 */
	@Transactional(rollbackFor = Exception.class)
	@Override
	public int update(T t) {
		return baseMapper.updateByPrimaryKeySelective(t);
	}

	/**
	 * 保存方法
	 * @param t 参数对象
	 * @return int
	 */
	@Transactional(rollbackFor = Exception.class)
	@Override
	public int save(T t) {
		return baseMapper.insert(t);
	}

	/**
	 * 删除方法
	 * @param resourceId 主键
	 * @return int
	 */
	@Transactional(rollbackFor = Exception.class)
	@Override
	public int delete(String resourceId) {
		return baseMapper.delete(baseMapper.selectByPrimaryKey(resourceId));
	}

	
}
