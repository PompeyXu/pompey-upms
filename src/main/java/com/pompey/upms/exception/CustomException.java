package com.pompey.upms.exception;

/**
 * @ClassName: CustomException
 * @Description: 定制异常处理类
 * @author PompeyXu
 * @date: 2019-04-09 21:40
 *
 */
public class CustomException extends RuntimeException {
	private static final long serialVersionUID = 4564124491192825748L;

	private int code;

	public CustomException() {
		super();
	}

	public CustomException(int code, String message) {
		super(message);
		this.setCode(code);
	}

	protected int getCode() {
		return code;
	}

	private void setCode(int code) {
		this.code = code;
	}
}
