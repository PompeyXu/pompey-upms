package com.pompey.upms.system.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pompey.upms.common.base.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author PompeyXu
 * @date 2019-04-08 23:49:37  
 */
@Data
@ApiModel("用户表")
@TableName(value = "sys_user_info")
public class UserInfo extends BaseVo<UserInfo> {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "登录账号")
	private String loginAccount;

	@ApiModelProperty(value = "用户昵称")
	private String userName;

	@ApiModelProperty(value = "登录密码")
	private String password;

	@ApiModelProperty(value = "电子邮箱")
	private String email;

	@ApiModelProperty(value = "手机号码")
	private String mobile;

	@ApiModelProperty(value = "办公电话")
	private String phone;

	@ApiModelProperty(value = "用户性别")
	private String sex;

	@ApiModelProperty(value = "头像路径")
	private String avatar;

	@ApiModelProperty(value = "个性签名")
	private String sign;

	@ApiModelProperty(value = "绑定的微信号")
	private String wxOpenid;

	@ApiModelProperty(value = "绑定的手机串号")
	private String mobileImei;

	@ApiModelProperty(value = "用户类型")
	private String userType;

	@ApiModelProperty(value = "用户类型引用编号")
	private String refCode;

	@ApiModelProperty(value = "用户类型引用姓名")
	private String refName;

	@ApiModelProperty(value = "管理员类型（0非管理员 1系统管理员  2二级管理员）")
	private String mgrType;

	@ApiModelProperty(value = "密码安全级别（0初始 1很弱 2弱 3安全 4很安全）")
	private String pwdSecurityLevel;

	@ApiModelProperty(value = "密码最后更新时间")
	private Date pwdUpdateDate;

	@ApiModelProperty(value = "密码修改记录")
	private String pwdUpdateRecord;

	@ApiModelProperty(value = "密保问题")
	private String pwdQuestionOne;

	@ApiModelProperty(value = "密保问题答案")
	private String pwdQuestionAnswerOne;

	@ApiModelProperty(value = "密保问题2")
	private String pwdQuestionTwo;

	@ApiModelProperty(value = "密保问题答案2")
	private String pwdQuestionAnswerTwo;

	@ApiModelProperty(value = "密保问题3")
	private String pwdQuestionThree;

	@ApiModelProperty(value = "密保问题答案3")
	private String pwdQuestionAnswerThree;

	@ApiModelProperty(value = "密码问题修改时间")
	private Date pwdQuestUpdateDate;

	@ApiModelProperty(value = "最后登陆IP")
	private String lastLoginIp;

	@ApiModelProperty(value = "最后登陆时间")
	private Date lastLoginDate;

	@ApiModelProperty(value = "冻结时间")
	private Date freezeDate;

	@ApiModelProperty(value = "冻结原因")
	private String freezeCause;

	@ApiModelProperty(value = "用户权重（降序）")
	private String userWeight;

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
