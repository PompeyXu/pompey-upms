package com.pompey.upms.system.bean;

import javax.persistence.Table;

/**
 * @ClassName: UserInfo
 * @Description: 用户表
 * @author Pompey
 * @date: 2019-04-07 17:37
 *
 */
@Table(name="sys_user_info")
public class UserInfo {

	/**
	 * 用户id
	 */
	private int id;
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
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", loginAccount=" + loginAccount + ", userName=" + userName + ", password="
				+ password + "]";
	}
	 
}
