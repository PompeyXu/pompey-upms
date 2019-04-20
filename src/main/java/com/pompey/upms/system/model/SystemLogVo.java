package com.pompey.upms.system.model;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pompey.upms.common.base.BaseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @author PompeyXu
* @date 2019-04-11 23:18:25
 */
@ApiModel("操作日志表")
@TableName(value = "sys_system_log")
public class SystemLogVo extends BaseVo{
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="日志类型")
	private String logType;
	
	@ApiModelProperty(value="日志标题")
	private String logTitle;
	
	@ApiModelProperty(value="创建者")
	private String createBy;
	
	@ApiModelProperty(value="用户名称")
	private String createByName;
	
	@ApiModelProperty(value="创建时间")
	private Date createDate;
	
	@ApiModelProperty(value="请求URI")
	private String requestUri;
	
	@ApiModelProperty(value="操作方式")
	private String requestMethod;
	
	@ApiModelProperty(value="操作提交的数据")
	private String requestParams;
	
	@ApiModelProperty(value="新旧数据比较结果")
	private String diffModifyData;
	
	@ApiModelProperty(value="业务主键")
	private String bizKey;
	
	@ApiModelProperty(value="业务类型")
	private String bizType;
	
	@ApiModelProperty(value="操作IP地址")
	private String remoteAddr;
	
	@ApiModelProperty(value="请求服务器地址")
	private String serverAddr;
	
	@ApiModelProperty(value="是否异常")
	private String isException;
	
	@ApiModelProperty(value="异常信息")
	private String exceptionInfo;
	
	@ApiModelProperty(value="用户代理")
	private String userAgent;
	
	@ApiModelProperty(value="设备名称/操作系统")
	private String deviceName;
	
	@ApiModelProperty(value="浏览器名称")
	private String browserName;
	
	@ApiModelProperty(value="执行时间")
	private String executeTime;


	public String getLogType() {
		return logType;
	}
	
	public void setLogType(String logType) {
		this.logType = logType;
	}
	public String getLogTitle() {
		return logTitle;
	}
	
	public void setLogTitle(String logTitle) {
		this.logTitle = logTitle;
	}
	
	public String getRequestUri() {
		return requestUri;
	}
	
	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}
	public String getRequestMethod() {
		return requestMethod;
	}
	
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	public String getRequestParams() {
		return requestParams;
	}
	
	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
	}
	public String getDiffModifyData() {
		return diffModifyData;
	}
	
	public void setDiffModifyData(String diffModifyData) {
		this.diffModifyData = diffModifyData;
	}
	public String getBizKey() {
		return bizKey;
	}
	
	public void setBizKey(String bizKey) {
		this.bizKey = bizKey;
	}
	public String getBizType() {
		return bizType;
	}
	
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getRemoteAddr() {
		return remoteAddr;
	}
	
	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}
	public String getServerAddr() {
		return serverAddr;
	}
	
	public void setServerAddr(String serverAddr) {
		this.serverAddr = serverAddr;
	}
	public String getIsException() {
		return isException;
	}
	
	public void setIsException(String isException) {
		this.isException = isException;
	}
	public String getExceptionInfo() {
		return exceptionInfo;
	}
	
	public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
	}
	public String getUserAgent() {
		return userAgent;
	}
	
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getDeviceName() {
		return deviceName;
	}
	
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getBrowserName() {
		return browserName;
	}
	
	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}
	public String getExecuteTime() {
		return executeTime;
	}
	
	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}
	
}

