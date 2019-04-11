package com.pompey.upms.system.model;

import java.util.Date;

import javax.persistence.Table;

import com.pompey.upms.common.model.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @author PompeyXu
* @date 2019-04-11 23:18:03
 */
@ApiModel("菜单表")
@Table(name = "sys_menu")
public class MenuVo extends BaseVo{
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="父级id")
	private String parentId;
	
	@ApiModelProperty(value="所有父级id")
	private String parentIds;
	
	@ApiModelProperty(value="全节点名")
	private String parentNames;
	
	@ApiModelProperty(value="本级排序号（升序）")
	private String sortNumber;
	
	@ApiModelProperty(value="是否最末级")
	private String menuLeaf;
	
	@ApiModelProperty(value="层次级别")
	private String menuLevel;
	
	@ApiModelProperty(value="菜单名称")
	private String menuName;
	
	@ApiModelProperty(value="菜单类型（1目录 2菜单 3按钮）")
	private String menuType;
	
	@ApiModelProperty(value="链接")
	private String menuHref;
	
	@ApiModelProperty(value="目标")
	private String menuTarget;
	
	@ApiModelProperty(value="图标")
	private String menuIcon;
	
	@ApiModelProperty(value="颜色")
	private String menuColor;
	
	@ApiModelProperty(value="权限标识")
	private String permission;
	
	@ApiModelProperty(value="菜单权重")
	private String weight;
	
	@ApiModelProperty(value="是否显示（1显示 0隐藏）")
	private String isShow;
	
	@ApiModelProperty(value="归属系统（default:主导航菜单、mobileApp:APP菜单）")
	private String sysCode;
	
	@ApiModelProperty(value="归属模块（多个用逗号隔开）")
	private String moduleCodes;
	
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

	public String getParentId() {
		return parentId;
	}
	
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getParentIds() {
		return parentIds;
	}
	
	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}
	public String getParentNames() {
		return parentNames;
	}
	
	public void setParentNames(String parentNames) {
		this.parentNames = parentNames;
	}
	public String getSortNumber() {
		return sortNumber;
	}
	
	public void setSortNumber(String sortNumber) {
		this.sortNumber = sortNumber;
	}
	public String getMenuLeaf() {
		return menuLeaf;
	}
	
	public void setMenuLeaf(String menuLeaf) {
		this.menuLeaf = menuLeaf;
	}
	public String getMenuLevel() {
		return menuLevel;
	}
	
	public void setMenuLevel(String menuLevel) {
		this.menuLevel = menuLevel;
	}
	public String getMenuName() {
		return menuName;
	}
	
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuType() {
		return menuType;
	}
	
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public String getMenuHref() {
		return menuHref;
	}
	
	public void setMenuHref(String menuHref) {
		this.menuHref = menuHref;
	}
	public String getMenuTarget() {
		return menuTarget;
	}
	
	public void setMenuTarget(String menuTarget) {
		this.menuTarget = menuTarget;
	}
	public String getMenuIcon() {
		return menuIcon;
	}
	
	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}
	public String getMenuColor() {
		return menuColor;
	}
	
	public void setMenuColor(String menuColor) {
		this.menuColor = menuColor;
	}
	public String getPermission() {
		return permission;
	}
	
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public String getWeight() {
		return weight;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getIsShow() {
		return isShow;
	}
	
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getSysCode() {
		return sysCode;
	}
	
	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}
	public String getModuleCodes() {
		return moduleCodes;
	}
	
	public void setModuleCodes(String moduleCodes) {
		this.moduleCodes = moduleCodes;
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
