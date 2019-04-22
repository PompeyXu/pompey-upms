package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pompey.upms.system.entity.RoleVo;

/**
 * 角色表Mapper
 * 
 * @author PompeyXu
 * @date 2019-04-11 23:17:39  
 */
@Mapper
public interface RoleMapper extends BaseMapper<RoleVo> {

}
