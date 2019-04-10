package com.pompey.upms.common.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
 * 公共属性
 * @author PompeyXu
 * @date 2019-04-10 23:15
 *
 */
public class BaseVo implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="主键id")
	private String resourceId;
	
	@ApiModelProperty(value="创建者")
	private String createBy;
	
	@ApiModelProperty(value="创建时间")
	private Date createDate;
	
	@ApiModelProperty(value="更新者")
	private String updateBy;
	
	@ApiModelProperty(value="更新时间")
	private Date updateDate;
	
	@ApiModelProperty(value="所属组织名称")
	private String orgName;
	
	@ApiModelProperty(value="所属组织id")
	private String orgFullId;
	
}
