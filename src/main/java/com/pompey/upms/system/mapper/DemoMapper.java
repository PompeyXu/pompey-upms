package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pompey.upms.system.entity.Demo;

/**
 * @ClassName: IDemoMapper
 * @Description: demoMapper
 * @author PompeyXu
 * @date: 2019-04-09 21:38
 *
 */
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {

	/**
	 * 根据主键获取用户信息 @param resourceId 主键 @return DemoVo @throws
	 */
	public Demo getUserInfoById(@Param("resourceId") String resourceId);

	/**
	 * 插入数据
	 * 
	 * @param userInfo 用户数据
	 * @return
	 */
	public int insert(Demo userInfo);
}
