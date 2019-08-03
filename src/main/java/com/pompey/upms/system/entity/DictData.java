package com.pompey.upms.system.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pompey.upms.common.base.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author PompeyXu
 * @date 2019-04-11 23:19:19  
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("字典数据表")
@TableName(value = "sys_dict_data")
public class DictData extends BaseVo<DictData> {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "字典类型id")
	private String dictId;

	@ApiModelProperty(value = "字典标签")
	private String dictLabel;

	@ApiModelProperty(value = "字典键值")
	private String dictValue;

	@ApiModelProperty(value = "字典类型")
	private String dictType;

	@ApiModelProperty(value = "系统内置（1是 0否）")
	private String isSys;

	@ApiModelProperty(value = "字典描述")
	private String description;

	@ApiModelProperty(value = "css样式（如：color:red)")
	private String cssStyle;

	@ApiModelProperty(value = "css类名（如：red）")
	private String cssClass;

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
