package com.pompey.upms.system.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pompey.upms.common.model.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @author PompeyXu
* @date 2019-04-11 23:17:39
 */
@ApiModel("角色表")
@TableName(value = "sys_role")
public class RoleVo extends BaseVo{
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="角色名称")
	private String roleName;
	
	@ApiModelProperty(value="角色分类（高管、中层、基层、其它）")
	private String roleType;
	
	@ApiModelProperty(value="角色排序（升序）")
	private String roleSort;
	
	@ApiModelProperty(value="系统内置（1是 0否）")
	private String isSys;
	
	@ApiModelProperty(value="状态（0正常 1删除 2停用）")
	private String status;
	
	@ApiModelProperty(value="备注信息")
	private String remarks;
	
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleType() {
		return roleType;
	}
	
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getRoleSort() {
		return roleSort;
	}
	
	public void setRoleSort(String roleSort) {
		this.roleSort = roleSort;
	}
	public String getIsSys() {
		return isSys;
	}
	
	public void setIsSys(String isSys) {
		this.isSys = isSys;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getRemarks() {
		return remarks;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}

