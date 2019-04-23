package com.pompey.upms.system.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pompey.upms.common.base.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author PompeyXu
 * @date 2019-04-11 23:30:06  
 */
@ApiModel("组织表")
@TableName(value = "sys_organization")
public class Organization extends BaseVo<Organization> {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "组织名称")
	private String orgName;

	@ApiModelProperty(value = "组织代码")
	private String orgCode;

	@ApiModelProperty(value = "层次级别")
	private String orgLevel;

	@ApiModelProperty(value = "本级排序号（升序）")
	private String sortNumber;

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

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgLevel() {
		return orgLevel;
	}

	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}

	public String getSortNumber() {
		return sortNumber;
	}

	public void setSortNumber(String sortNumber) {
		this.sortNumber = sortNumber;
	}

	public String getOrgLeaf() {
		return orgLeaf;
	}

	public void setOrgLeaf(String orgLeaf) {
		this.orgLeaf = orgLeaf;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentOrgId() {
		return parentOrgId;
	}

	public void setParentOrgId(String parentOrgId) {
		this.parentOrgId = parentOrgId;
	}

	public String getParentParentIds() {
		return parentParentIds;
	}

	public void setParentParentIds(String parentParentIds) {
		this.parentParentIds = parentParentIds;
	}

	public String getFullNames() {
		return fullNames;
	}

	public void setFullNames(String fullNames) {
		this.fullNames = fullNames;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getExtendS1() {
		return extendS1;
	}

	public void setExtendS1(String extendS1) {
		this.extendS1 = extendS1;
	}

	public String getExtendS2() {
		return extendS2;
	}

	public void setExtendS2(String extendS2) {
		this.extendS2 = extendS2;
	}

	public String getExtendI1() {
		return extendI1;
	}

	public void setExtendI1(String extendI1) {
		this.extendI1 = extendI1;
	}

	public String getExtendI2() {
		return extendI2;
	}

	public void setExtendI2(String extendI2) {
		this.extendI2 = extendI2;
	}

	public String getExtendF1() {
		return extendF1;
	}

	public void setExtendF1(String extendF1) {
		this.extendF1 = extendF1;
	}

	public String getExtendF2() {
		return extendF2;
	}

	public void setExtendF2(String extendF2) {
		this.extendF2 = extendF2;
	}

	public Date getExtendD1() {
		return extendD1;
	}

	public void setExtendD1(Date extendD1) {
		this.extendD1 = extendD1;
	}

	public Date getExtendD2() {
		return extendD2;
	}

	public void setExtendD2(Date extendD2) {
		this.extendD2 = extendD2;
	}
}
