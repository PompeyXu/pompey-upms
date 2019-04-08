package com.pompey.upms.exception;

/**
 * @ClassName: ErrorResponseEntity
 * @Description: 异常信息模板
 * @author Pompey
 * @date: 2019-04-08 22:04
 *
 */
public class ErrorResponseEntity {
	private int code;
    private String message;

    public ErrorResponseEntity(int code, String message) {
        this.code = code;
        this.message = message;
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
}
