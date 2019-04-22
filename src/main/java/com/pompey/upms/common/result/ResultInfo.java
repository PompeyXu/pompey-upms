package com.pompey.upms.common.result;

import org.springframework.util.StringUtils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回结果包装类
 * 
 * @author PompeyXu
 * @date 2019-04-20 19:52
 */
@ApiModel("返回结果")
public class ResultInfo<T> {

	@ApiModelProperty(value = "编码")
	private int code;

	@ApiModelProperty(value = "数据")
	private T data;

	@ApiModelProperty(value = "消息")
	private String msg;

	public ResultInfo() {
		super();
	}

	public ResultInfo(T data) {
		super();
		this.data = data;
		this.code = ResultEnum.SUCCESS.getCode();
		this.msg = ResultEnum.SUCCESS.getMsg();
	}

	public ResultInfo(int code, T data, String msg) {
		super();
		this.code = code;
		this.data = data;
		this.msg = msg;
	}

	public ResultInfo(int code, String msg) {
		super();
		this.code = code;
		this.data = null;
		this.msg = msg;
	}

	/**
	 * 返回成功 @param data @param msg @return @throws
	 */
	public static <T> ResultInfo<T> success(T data, String msg) {
		return new ResultInfo<T>(ResultEnum.SUCCESS.getCode(), data,
				StringUtils.isEmpty(msg) ? ResultEnum.SUCCESS.getMsg() : msg);
	}

	/**
	 * 返回失败 @param msg @return @throws
	 */
	public static <T> ResultInfo<T> fail(String msg) {
		return new ResultInfo<T>(ResultEnum.FAIL.getCode(), msg);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
