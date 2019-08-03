package com.pompey.upms.common.result;

import lombok.*;
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
@Setter
@Getter
@ToString
public class ResultInfo<T> {

	@ApiModelProperty(value = "状态响应码")
	private int code;

	@ApiModelProperty(value = "数据")
	private T data;

	@ApiModelProperty(value = "消息")
	private String message;

	public ResultInfo() {
		super();
	}

	public ResultInfo(T data) {
		super();
		this.data = data;
		this.code = ResultEnum.SUCCESS.getCode();
		this.message = ResultEnum.SUCCESS.getMsg();
	}

	private ResultInfo(int code, T data, String message) {
		super();
		this.code = code;
		this.data = data;
		this.message = message;
	}

	private ResultInfo(int code, String message) {
		super();
		this.code = code;
		this.data = null;
		this.message = message;
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



}
