package com.pompey.upms.common.service;

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
	 * 通過id查詢
	 * @param resourceId 主键id
	 * @return: T 返回对象
	 * @throws
	 */
	public T getById(String resourceId);
	
	/**
	 * 更新方法
	 * @param t 参数对象
	 * @return int 返回类型
	 * @throws
	 */
	public int update(T t);
	
	/**
	 * 保存方法
	 * @param t 参数对象
	 * @return int
	 * @throws
	 */
	public int save(T t);
	
	/**
	 * 删除方法
	 * @param resourceId 主键
	 * @return int
	 * @throws
	 */
	public int delete(String resourceId);
	
}
