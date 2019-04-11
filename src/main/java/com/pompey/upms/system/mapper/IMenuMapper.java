package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.pompey.upms.system.model.MenuVo;
import tk.mybatis.mapper.common.BaseMapper;

/**
* 菜单表Mapper
* @author PompeyXu
* @date 2019-04-11 23:18:03
 */
@Mapper
public interface IMenuMapper extends BaseMapper<MenuVo>{
	
}
