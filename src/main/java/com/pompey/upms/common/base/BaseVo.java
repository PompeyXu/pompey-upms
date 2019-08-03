package com.pompey.upms.common.base;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 公共属性基类
 * 
 * @author PompeyXu
 * @date 2019-04-10 23:15
 */
@Data
public class BaseVo<T> implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "主键id")
	@TableId(type = IdType.UUID)
	private String resourceId;

	@ApiModelProperty(value = "序号")
	private Integer sortNumber;

	@ApiModelProperty(value = "创建者")
	private String createBy;

	@ApiModelProperty(value = "创建时间")
	private Date createDate;

	@ApiModelProperty(value = "更新者")
	private String updateBy;

	@ApiModelProperty(value = "更新时间")
	private Date updateDate;

	@ApiModelProperty(value = "所属组织id")
	private String orgId;

	@ApiModelProperty(value = "所属组织名称")
	private String orgName;

	@ApiModelProperty(value = "所属组织id")
	private String orgFullId;
	
	@ApiModelProperty(value = "删除标识(N-未删除 Y-删除")
	@TableLogic
	private String delFlag;
}
