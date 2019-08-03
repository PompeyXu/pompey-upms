package com.pompey.upms.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pompey.upms.common.base.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author PompeyXu
 * @date 2019-04-11 23:17:39  
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("角色表")
@TableName(value = "sys_role")
public class Role extends BaseVo<Role> {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "角色名称")
	private String roleName;

	@ApiModelProperty(value = "角色分类（高管、中层、基层、其它）")
	private String roleType;

	@ApiModelProperty(value = "系统内置（1是 0否）")
	private String isSys;

	@ApiModelProperty(value = "备注信息")
	private String remarks;

}
