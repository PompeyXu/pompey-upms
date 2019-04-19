package com.pompey.upms.common.model;

import java.util.Date;

import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

/**
 * 公共属性
 * @author PompeyXu
 * @date 2019-04-10 23:15
 */
public class BaseVo implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="主键id")
	@Id
	private String resourceId;
	
	@ApiModelProperty(value="创建者")
	private String createBy;
	
	@ApiModelProperty(value="创建时间")
	private Date createDate;
	
	@ApiModelProperty(value="更新者")
	private String updateBy;
	
	@ApiModelProperty(value="更新时间")
	private Date updateDate;
	
	@ApiModelProperty(value="所属组织id")
	private String orgId;
	
	@ApiModelProperty(value="所属组织名称")
	private String orgName;
	
	@ApiModelProperty(value="所属组织id")
	private String orgFullId;
	

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgFullId() {
		return orgFullId;
	}

	public void setOrgFullId(String orgFullId) {
		this.orgFullId = orgFullId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
	
}
