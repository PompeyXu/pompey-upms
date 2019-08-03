package com.pompey.upms.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pompey.upms.common.base.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author PompeyXu
 * @date 2019-04-11 23:20:20  
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("参数配置表")
@TableName(value = "sys_system_config")
public class SystemConfig extends BaseVo<SystemConfig> {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "名称")
	private String configName;

	@ApiModelProperty(value = "参数键")
	private String configKey;

	@ApiModelProperty(value = "参数值")
	private String configValue;

	@ApiModelProperty(value = "系统内置（1是 0否）")
	private String isSys;

	@ApiModelProperty(value = "备注信息")
	private String remarks;

}
