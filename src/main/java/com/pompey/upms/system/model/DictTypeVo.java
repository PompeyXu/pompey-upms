package com.pompey.upms.system.model;

import javax.persistence.Table;
import com.pompey.upms.common.model.BaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @author PompeyXu
* @date 2019-04-11 23:18:44
 */
@ApiModel("字典类型表")
@Table(name = "sys_dict_type")
public class DictTypeVo extends BaseVo{
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="字典编码")
	private String dictCode;
	
	@ApiModelProperty(value="字典名称")
	private String dictName;
	
	@ApiModelProperty(value="字典类型")
	private String dictType;
	
	@ApiModelProperty(value="是否系统字典")
	private String isSys;
	
	@ApiModelProperty(value="状态（0正常 1删除 2停用）")
	private String status;
	
	@ApiModelProperty(value="备注信息")
	private String remarks;
	
	public String getDictCode() {
		return dictCode;
	}
	
	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}
	public String getDictName() {
		return dictName;
	}
	
	public void setDictName(String dictName) {
		this.dictName = dictName;
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
	
}

