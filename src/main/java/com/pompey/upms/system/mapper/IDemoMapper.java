package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.pompey.upms.system.bean.DemoVo;

import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface IDemoMapper extends BaseMapper<DemoVo>{

	public DemoVo getUserInfoById(@Param("id") int id);
	
	public int insert(DemoVo userInfo);
}
