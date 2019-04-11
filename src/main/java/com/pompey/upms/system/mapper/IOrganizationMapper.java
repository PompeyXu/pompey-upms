package com.pompey.upms.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.pompey.upms.system.model.OrganizationVo;
import tk.mybatis.mapper.common.BaseMapper;

/**
* 组织表Mapper 
* @author PompeyXu
* @date 2019-04-11 23:30:06
 */
@Mapper
public interface IOrganizationMapper extends BaseMapper<OrganizationVo>{
	
}