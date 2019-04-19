package com.pompey.upms.common.result;

public enum ResultConstants {
	/**
	 * 成功
	 */
	SUCCESS(0,"success"),
	
	/**
	 *失败 
	 */
	FAIL(1,"fail");
	
	private int code;
	private String msg;
	
	private ResultConstants(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
