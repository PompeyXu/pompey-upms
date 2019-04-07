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
	 * 
	 * @Title: getById
	 * @Description: 通過id查詢
	 * @param: @param id
	 * @param: @return
	 * @return: T
	 * @throws
	 */
	public T getById(int id);
	
	public int update(T t);
	
	public int save(T t);
	
	public int delete(int id);
	
}
