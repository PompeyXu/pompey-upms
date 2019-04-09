package com.pompey.upms.system.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @ClassName: UserInfo
 * @Description: 用户表
 * @author PompeyXu
 * @date: 2019-04-07 17:37
 *
 */
@Table(name="sys_user_info")
public class DemoVo implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户id
	 */
	private String resourceId;
	/**
	 * 登录账号
	 */
	private String loginAccount;
	
	/**
	 * 用户昵称
	 */
	private String userName;
	
	/**
	 * 登录密码
	 */
	private String password;
	
	@Transient
	private LocalDateTime updateDateTime;
	@Transient
	private Date crateDateTime;
	
	
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
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
	
	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
	public Date getCrateDateTime() {
		return crateDateTime;
	}
	public void setCrateDateTime(Date crateDateTime) {
		this.crateDateTime = crateDateTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	 
}
