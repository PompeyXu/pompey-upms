package com.pompey.upms.common.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;

/**
 * @ClassName: IBaseService
 * @Description: 公共service接口
 * @author Pompey
 * @date: 2019-04-07 20:57
 *
 * @param <T>
 */
public interface IBaseService<T> {

	/**
	 * 分页查询
	 * @param params 查询参数
	 * @param pageSize 第几页
	 * @param size 每页数据条数
	 * @return PageInfo<T> 分页数据
	 */
	public PageInfo<T> getPageInfo(Map<String, Object> params, int pageSize, int size);
	
	/**
	 * 通过id查詢
	 * @param resourceId 主键id
	 * @return: T 返回对象
	 */
	public T getById(String resourceId);
	
	/**
	 * 更新方法
	 * @param t 参数对象
	 * @return int 返回类型
	 */
	public int update(T t);
	
	/**
	 * 保存方法
	 * @param t 参数对象
	 * @return int
	 */
	public int save(T t);
	
	/**
	 * 删除方法
	 * @param resourceId 主键
	 * @return int
	 */
	public int delete(String resourceId);
	
}
