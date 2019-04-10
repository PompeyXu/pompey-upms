package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.pompey.upms.system.model.DemoVo;

import tk.mybatis.mapper.common.BaseMapper;

/**
 * @ClassName: IDemoMapper
 * @Description: demoMapper 
 * @author PompeyXu
 * @date: 2019-04-09 21:38
 *
 */
@Mapper
public interface IDemoMapper extends BaseMapper<DemoVo>{

	/**
	 * 根据主键获取用户信息
	 * @param resourceId 主键
	 * @return DemoVo
	 * @throws
	 */
	public DemoVo getUserInfoById(@Param("resourceId") String resourceId);
	
	/**
	 * 插入数据
	 * @param userInfo 用户数据
	 * @return
	 */
	public int insert(DemoVo userInfo);
}
