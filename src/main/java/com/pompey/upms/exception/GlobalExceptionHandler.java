package com.pompey.upms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: GlobalExceptionHandler
 * @Description: 全局异常处理
 * @author Pompey
 * @date: 2019-04-08 22:05
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler{

	/**
	 * @Title: customExceptionHandler @Description: 定义要捕获的异常
	 * 可以多个 @ExceptionHandler({}) @param: @param request @param: @param
	 * e @param: @param response @param: @return @return:
	 * ErrorResponseEntity @throws
	 */
	@ExceptionHandler(CustomException.class)
	public ErrorResponseEntity customExceptionHandler(HttpServletRequest request, final Exception e,
													  HttpServletResponse response) {
		e.printStackTrace();
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		CustomException exception = (CustomException) e;
		return new ErrorResponseEntity(exception.getCode(), exception.getMessage());
	}

	/**
	 * @Title: runtimeExceptionHandler @Description: 捕获 RuntimeException
	 * 异常 @param: @param request @param: @param e @param: @param
	 * response @param: @return @return: ErrorResponseEntity @throws
	 */
	@ExceptionHandler(RuntimeException.class)
	public ErrorResponseEntity runtimeExceptionHandler(HttpServletRequest request, final Exception e,
			HttpServletResponse response) {
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		RuntimeException exception = (RuntimeException) e;
		return new ErrorResponseEntity(400, exception.getMessage());
	}
}
