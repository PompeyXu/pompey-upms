package com.pompey.upms.system.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pompey.upms.common.model.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @author PompeyXu
* @date 2019-04-11 23:20:20
 */
@ApiModel("参数配置表")
@TableName(value = "sys_system_config")
public class SystemConfigVo extends BaseVo{
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="名称")
	private String configName;
	
	@ApiModelProperty(value="参数键")
	private String configKey;
	
	@ApiModelProperty(value="参数值")
	private String configValue;
	
	@ApiModelProperty(value="系统内置（1是 0否）")
	private String isSys;
	
	@ApiModelProperty(value="备注信息")
	private String remarks;

	
	public String getConfigName() {
		return configName;
	}
	
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	public String getConfigKey() {
		return configKey;
	}
	
	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}
	public String getConfigValue() {
		return configValue;
	}
	
	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}
	public String getIsSys() {
		return isSys;
	}
	
	public void setIsSys(String isSys) {
		this.isSys = isSys;
	}
	
	public String getRemarks() {
		return remarks;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}

