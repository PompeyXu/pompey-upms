package com.pompey.upms.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author PompeyXu
 * @date 2019-04-11 23:30:06  
 */
@Data
@ApiModel("组织表")
@TableName(value = "sys_organization")
public class Organization implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "主键id")
	@TableId(type = IdType.UUID)
	private String resourceId;

	@ApiModelProperty(value = "序号")
	private Integer sortNumber;

	@ApiModelProperty(value = "组织名称")
	private String orgName;

	@ApiModelProperty(value = "组织代码")
	private String orgCode;

	@ApiModelProperty(value = "层次级别")
	private String orgLevel;

	@ApiModelProperty(value = "是否最末级")
	private String orgLeaf;

	@ApiModelProperty(value = "父组织id")
	private String parentId;

	@ApiModelProperty(value = "父组织编号")
	private String parentOrgId;

	@ApiModelProperty(value = "所有父级编号")
	private String parentParentIds;

	@ApiModelProperty(value = "全节点名")
	private String fullNames;

	@ApiModelProperty(value = "区域编码")
	private String areaCode;

	@ApiModelProperty(value = "备注信息")
	private String remarks;

	@ApiModelProperty(value = "创建者")
	private String createBy;

	@ApiModelProperty(value = "创建时间")
	private Date createDate;

	@ApiModelProperty(value = "更新者")
	private String updateBy;

	@ApiModelProperty(value = "更新时间")
	private Date updateDate;

	@ApiModelProperty(value = "删除标识(N-未删除 Y-删除")
	@TableLogic
	private String delFlag;

	@ApiModelProperty(value = "扩展 String 1")
	private String extendS1;

	@ApiModelProperty(value = "扩展 String 2")
	private String extendS2;

	@ApiModelProperty(value = "扩展 Integer 1")
	private String extendI1;

	@ApiModelProperty(value = "扩展 Integer 2")
	private String extendI2;

	@ApiModelProperty(value = "扩展 Float 1")
	private String extendF1;

	@ApiModelProperty(value = "扩展 Float 2")
	private String extendF2;

	@ApiModelProperty(value = "扩展 Date 1")
	private Date extendD1;

	@ApiModelProperty(value = "扩展 Date 2")
	private Date extendD2;


	@ApiModelProperty(value = "子对象", hidden = true)
	@TableField(exist = false)
	private List<Organization> children = new ArrayList<>();

}
