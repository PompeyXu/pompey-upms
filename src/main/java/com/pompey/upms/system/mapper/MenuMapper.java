package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pompey.upms.system.model.MenuVo;

/**
* 菜单表Mapper
* @author PompeyXu
* @date 2019-04-11 23:18:03
 */
@Mapper
public interface MenuMapper extends BaseMapper<MenuVo>{
	
}
