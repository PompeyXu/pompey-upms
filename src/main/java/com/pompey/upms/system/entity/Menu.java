package com.pompey.upms.system.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pompey.upms.common.base.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author PompeyXu
 * @date 2019-04-11 23:18:03  
 */
@Data
@ApiModel("菜单表")
@TableName(value = "sys_menu")
public class Menu extends BaseVo<Menu> {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "父级id")
	private String parentId;

	@ApiModelProperty(value = "所有父级id")
	private String parentIds;

	@ApiModelProperty(value = "全节点名")
	private String parentNames;

	@ApiModelProperty(value = "是否最末级")
	private String menuLeaf;

	@ApiModelProperty(value = "层次级别")
	private String menuLevel;

	@ApiModelProperty(value = "菜单名称")
	private String menuName;

	@ApiModelProperty(value = "菜单类型（1目录 2菜单 3按钮）")
	private String menuType;

	@ApiModelProperty(value = "链接")
	private String menuHref;

	@ApiModelProperty(value = "目标")
	private String menuTarget;

	@ApiModelProperty(value = "图标")
	private String menuIcon;

	@ApiModelProperty(value = "颜色")
	private String menuColor;

	@ApiModelProperty(value = "权限标识")
	private String permission;

	@ApiModelProperty(value = "菜单权重")
	private String weight;

	@ApiModelProperty(value = "是否显示（1显示 0隐藏）")
	private String isShow;

	@ApiModelProperty(value = "归属系统（default:主导航菜单、mobileApp:APP菜单）")
	private String sysCode;

	@ApiModelProperty(value = "归属模块（多个用逗号隔开）")
	private String moduleCodes;

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
}
