package com.pompey.upms.system.model;

import java.util.Date;

import javax.persistence.Table;

import com.pompey.upms.common.model.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @author PompeyXu
* @date 2019-04-08 23:49:37
 */
@ApiModel("用户表")
@Table(name="sys_user_info")
public class UserInfoVo extends BaseVo{
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="登录账号")
	private String loginAccount;
	
	@ApiModelProperty(value="用户昵称")
	private String userName;
	
	@ApiModelProperty(value="登录密码")
	private String password;
	
	@ApiModelProperty(value="电子邮箱")
	private String email;
	
	@ApiModelProperty(value="手机号码")
	private String mobile;
	
	@ApiModelProperty(value="办公电话")
	private String phone;
	
	@ApiModelProperty(value="用户性别")
	private String sex;
	
	@ApiModelProperty(value="头像路径")
	private String avatar;
	
	@ApiModelProperty(value="个性签名")
	private String sign;
	
	@ApiModelProperty(value="绑定的微信号")
	private String wxOpenid;
	
	@ApiModelProperty(value="绑定的手机串号")
	private String mobileImei;
	
	@ApiModelProperty(value="用户类型")
	private String userType;
	
	@ApiModelProperty(value="用户类型引用编号")
	private String refCode;
	
	@ApiModelProperty(value="用户类型引用姓名")
	private String refName;
	
	@ApiModelProperty(value="管理员类型（0非管理员 1系统管理员  2二级管理员）")
	private String mgrType;
	
	@ApiModelProperty(value="密码安全级别（0初始 1很弱 2弱 3安全 4很安全）")
	private String pwdSecurityLevel;
	
	@ApiModelProperty(value="密码最后更新时间")
	private Date pwdUpdateDate;
	
	@ApiModelProperty(value="密码修改记录")
	private String pwdUpdateRecord;
	
	@ApiModelProperty(value="密保问题")
	private String pwdQuestionA;
	
	@ApiModelProperty(value="密保问题答案")
	private String pwdQuestionAnswerA;
	
	@ApiModelProperty(value="密保问题2")
	private String pwdQuestionB;
	
	@ApiModelProperty(value="密保问题答案2")
	private String pwdQuestionAnswerB;
	
	@ApiModelProperty(value="密保问题3")
	private String pwdQuestionC;
	
	@ApiModelProperty(value="密保问题答案3")
	private String pwdQuestionAnswerC;
	
	@ApiModelProperty(value="密码问题修改时间")
	private Date pwdQuestUpdateDate;
	
	@ApiModelProperty(value="最后登陆IP")
	private String lastLoginIp;
	
	@ApiModelProperty(value="最后登陆时间")
	private Date lastLoginDate;
	
	@ApiModelProperty(value="冻结时间")
	private Date freezeDate;
	
	@ApiModelProperty(value="冻结原因")
	private String freezeCause;
	
	@ApiModelProperty(value="用户权重（降序）")
	private String userWeight;
	
	@ApiModelProperty(value="状态（0正常 1删除 2停用 3冻结）")
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

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getWxOpenid() {
		return wxOpenid;
	}

	public void setWxOpenid(String wxOpenid) {
		this.wxOpenid = wxOpenid;
	}

	public String getMobileImei() {
		return mobileImei;
	}

	public void setMobileImei(String mobileImei) {
		this.mobileImei = mobileImei;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getRefCode() {
		return refCode;
	}

	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public String getMgrType() {
		return mgrType;
	}

	public void setMgrType(String mgrType) {
		this.mgrType = mgrType;
	}

	public String getPwdSecurityLevel() {
		return pwdSecurityLevel;
	}

	public void setPwdSecurityLevel(String pwdSecurityLevel) {
		this.pwdSecurityLevel = pwdSecurityLevel;
	}

	public Date getPwdUpdateDate() {
		return pwdUpdateDate;
	}

	public void setPwdUpdateDate(Date pwdUpdateDate) {
		this.pwdUpdateDate = pwdUpdateDate;
	}

	public String getPwdUpdateRecord() {
		return pwdUpdateRecord;
	}

	public void setPwdUpdateRecord(String pwdUpdateRecord) {
		this.pwdUpdateRecord = pwdUpdateRecord;
	}

	public String getPwdQuestionA() {
		return pwdQuestionA;
	}

	public void setPwdQuestionA(String pwdQuestionA) {
		this.pwdQuestionA = pwdQuestionA;
	}

	public String getPwdQuestionAnswerA() {
		return pwdQuestionAnswerA;
	}

	public void setPwdQuestionAnswerA(String pwdQuestionAnswerA) {
		this.pwdQuestionAnswerA = pwdQuestionAnswerA;
	}

	public String getPwdQuestionB() {
		return pwdQuestionB;
	}

	public void setPwdQuestionB(String pwdQuestionB) {
		this.pwdQuestionB = pwdQuestionB;
	}

	public String getPwdQuestionAnswerB() {
		return pwdQuestionAnswerB;
	}

	public void setPwdQuestionAnswerB(String pwdQuestionAnswerB) {
		this.pwdQuestionAnswerB = pwdQuestionAnswerB;
	}

	public String getPwdQuestionC() {
		return pwdQuestionC;
	}

	public void setPwdQuestionC(String pwdQuestionC) {
		this.pwdQuestionC = pwdQuestionC;
	}

	public String getPwdQuestionAnswerC() {
		return pwdQuestionAnswerC;
	}

	public void setPwdQuestionAnswerC(String pwdQuestionAnswerC) {
		this.pwdQuestionAnswerC = pwdQuestionAnswerC;
	}

	public Date getPwdQuestUpdateDate() {
		return pwdQuestUpdateDate;
	}

	public void setPwdQuestUpdateDate(Date pwdQuestUpdateDate) {
		this.pwdQuestUpdateDate = pwdQuestUpdateDate;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Date getFreezeDate() {
		return freezeDate;
	}

	public void setFreezeDate(Date freezeDate) {
		this.freezeDate = freezeDate;
	}

	public String getFreezeCause() {
		return freezeCause;
	}

	public void setFreezeCause(String freezeCause) {
		this.freezeCause = freezeCause;
	}

	public String getUserWeight() {
		return userWeight;
	}

	public void setUserWeight(String userWeight) {
		this.userWeight = userWeight;
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

