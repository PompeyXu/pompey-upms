package com.pompey.upms.system.model;

import java.util.Date;

import javax.persistence.Table;

import com.pompey.upms.common.model.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @author PompeyXu
* @date 2019-04-11 23:19:19
 */
@ApiModel("字典数据表")
@Table(name = "sys_dict_data")
public class DictDataVo extends BaseVo{
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="字典类型id")
	private String dictId;
	
	@ApiModelProperty(value="本级排序号（升序）")
	private String sortNumber;
	
	@ApiModelProperty(value="字典标签")
	private String dictLabel;
	
	@ApiModelProperty(value="字典键值")
	private String dictValue;
	
	@ApiModelProperty(value="字典类型")
	private String dictType;
	
	@ApiModelProperty(value="系统内置（1是 0否）")
	private String isSys;
	
	@ApiModelProperty(value="字典描述")
	private String description;
	
	@ApiModelProperty(value="css样式（如：color:red)")
	private String cssStyle;
	
	@ApiModelProperty(value="css类名（如：red）")
	private String cssClass;
	
	@ApiModelProperty(value="状态（0正常 1删除 2停用）")
	private String status;
	
	@ApiModelProperty(value="备注信息")
	private String remarks;
	
	@ApiModelProperty(value="扩展 String 1")
	private String extendS1;
	
	@ApiModelProperty(value="扩展 String 2")
	private String extendS2;
	
	@ApiModelProperty(value="扩展 String 3")
	private String extendS3;
	
	@ApiModelProperty(value="扩展 String 4")
	private String extendS4;
	
	@ApiModelProperty(value="扩展 Integer 1")
	private String extendI1;
	
	@ApiModelProperty(value="扩展 Integer 2")
	private String extendI2;
	
	@ApiModelProperty(value="扩展 Integer 3")
	private String extendI3;
	
	@ApiModelProperty(value="扩展 Integer 4")
	private String extendI4;
	
	@ApiModelProperty(value="扩展 Float 1")
	private String extendF1;
	
	@ApiModelProperty(value="扩展 Float 2")
	private String extendF2;
	
	@ApiModelProperty(value="扩展 Float 3")
	private String extendF3;
	
	@ApiModelProperty(value="扩展 Float 4")
	private String extendF4;
	
	@ApiModelProperty(value="扩展 Date 1")
	private Date extendD1;
	
	@ApiModelProperty(value="扩展 Date 2")
	private Date extendD2;
	
	@ApiModelProperty(value="扩展 Date 3")
	private Date extendD3;
	
	@ApiModelProperty(value="扩展 Date 4")
	private Date extendD4;

	public String getDictId() {
		return dictId;
	}
	
	public void setDictId(String dictId) {
		this.dictId = dictId;
	}
	public String getSortNumber() {
		return sortNumber;
	}
	
	public void setSortNumber(String sortNumber) {
		this.sortNumber = sortNumber;
	}
	public String getDictLabel() {
		return dictLabel;
	}
	
	public void setDictLabel(String dictLabel) {
		this.dictLabel = dictLabel;
	}
	public String getDictValue() {
		return dictValue;
	}
	
	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	public String getDictType() {
		return dictType;
	}
	
	public void setDictType(String dictType) {
		this.dictType = dictType;
	}
	public String getIsSys() {
		return isSys;
	}
	
	public void setIsSys(String isSys) {
		this.isSys = isSys;
	}
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCssStyle() {
		return cssStyle;
	}
	
	public void setCssStyle(String cssStyle) {
		this.cssStyle = cssStyle;
	}
	public String getCssClass() {
		return cssClass;
	}
	
	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
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
	public String getExtendS3() {
		return extendS3;
	}
	
	public void setExtendS3(String extendS3) {
		this.extendS3 = extendS3;
	}
	public String getExtendS4() {
		return extendS4;
	}
	
	public void setExtendS4(String extendS4) {
		this.extendS4 = extendS4;
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
	public String getExtendI3() {
		return extendI3;
	}
	
	public void setExtendI3(String extendI3) {
		this.extendI3 = extendI3;
	}
	public String getExtendI4() {
		return extendI4;
	}
	
	public void setExtendI4(String extendI4) {
		this.extendI4 = extendI4;
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
	public String getExtendF3() {
		return extendF3;
	}
	
	public void setExtendF3(String extendF3) {
		this.extendF3 = extendF3;
	}
	public String getExtendF4() {
		return extendF4;
	}
	
	public void setExtendF4(String extendF4) {
		this.extendF4 = extendF4;
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
	public Date getExtendD3() {
		return extendD3;
	}
	
	public void setExtendD3(Date extendD3) {
		this.extendD3 = extendD3;
	}
	public Date getExtendD4() {
		return extendD4;
	}
	
	public void setExtendD4(Date extendD4) {
		this.extendD4 = extendD4;
	}
}

