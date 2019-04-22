package com.pompey.upms.common.result;

/**
 * 返回状态枚举
 * 
 * @author PompeyXu
 * @date 2019-04-20 19:52
 *
 */
public enum ResultEnum {
	/**
	 * 成功
	 */
	SUCCESS(0, "success"),

	/**
	 * 失败
	 */
	FAIL(1, "fail");

	private int code;
	private String msg;

	private ResultEnum(int code, String msg) {
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
