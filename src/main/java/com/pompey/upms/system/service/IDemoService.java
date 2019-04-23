package com.pompey.upms.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pompey.upms.system.entity.Demo;

/**
 * @ClassName: IDemoService
 * @Description: 测试Service接口
 * @author PompeyXu
 * @date: 2019-04-09 21:36
 *
 */
public interface IDemoService extends IService<Demo> {

	/**
	 * 分页获取数据 @return @throws
	 */
//	public PageInfo<DemoVo> getList();

	/**
	 * 根据id获取用户数据 @param id 主键 @return @throws
	 */
	public Demo getUserInfoById(String id);

	/**
	 * 插入数据 @param userInfo 用户数据 @return @throws
	 */
	public int insert(Demo userInfo);
}
