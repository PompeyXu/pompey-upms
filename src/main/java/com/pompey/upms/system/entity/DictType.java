package com.pompey.upms.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pompey.upms.common.base.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author PompeyXu
 * @date 2019-04-11 23:18:44  
 */
@Data
@ApiModel("字典类型表")
@TableName(value = "sys_dict_type")
public class DictType extends BaseVo<DictType> {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "字典编码")
	private String dictCode;

	@ApiModelProperty(value = "字典名称")
	private String dictName;

	@ApiModelProperty(value = "字典类型")
	private String dictType;

	@ApiModelProperty(value = "是否系统字典")
	private String isSys;

	@ApiModelProperty(value = "备注信息")
	private String remarks;

}
