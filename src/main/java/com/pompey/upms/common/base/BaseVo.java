package com.pompey.upms.common.base;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;

import io.swagger.annotations.ApiModelProperty;

/**
 * 公共属性基类
 * @author PompeyXu
 * @date 2019-04-10 23:15
 */
public abstract class BaseVo<T> implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="主键id")
	@TableId(type = IdType.UUID)
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
	
	@ApiModelProperty(value="状态（0正常 1删除）")
	@TableLogic
	private String status;
	

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
