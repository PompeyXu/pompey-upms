package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pompey.upms.system.entity.SystemLogVo;

/**
 * 操作日志表Mapper
 * 
 * @author PompeyXu
 * @date 2019-04-11 23:18:25  
 */
@Mapper
public interface SystemLogMapper extends BaseMapper<SystemLogVo> {

}
