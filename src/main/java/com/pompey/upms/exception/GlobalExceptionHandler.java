package com.pompey.upms.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @ClassName: GlobalExceptionHandler
 * @Description: 全局异常处理
 * @author Pompey
 * @date: 2019-04-08 22:05
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

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
		e.printStackTrace();
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		RuntimeException exception = (RuntimeException) e;
		return new ErrorResponseEntity(400, exception.getMessage());
	}

	/**
	 * Title: handleExceptionInternal Description: 通用的接口映射异常处理方
	 * 
	 * @param ex
	 * @param body
	 * @param headers
	 * @param status
	 * @param request
	 * @return
	 * @see org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler#handleExceptionInternal(java.lang.Exception,
	 *      java.lang.Object, org.springframework.http.HttpHeaders,
	 *      org.springframework.http.HttpStatus,
	 *      org.springframework.web.context.request.WebRequest)
	 */
	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		ex.printStackTrace();
		if (ex instanceof MethodArgumentNotValidException) {
			MethodArgumentNotValidException exception = (MethodArgumentNotValidException) ex;
			return new ResponseEntity<>(new ErrorResponseEntity(status.value(),
					exception.getBindingResult().getAllErrors().get(0).getDefaultMessage()), status);
		}
		if (ex instanceof MethodArgumentTypeMismatchException) {
			MethodArgumentTypeMismatchException exception = (MethodArgumentTypeMismatchException) ex;
			logger.error("参数转换失败，方法：" + exception.getParameter().getMethod().getName() + "，参数：" + exception.getName()
					+ ",信息：" + exception.getLocalizedMessage());
			return new ResponseEntity<>(new ErrorResponseEntity(status.value(), "参数转换失败"), status);
		}
		return new ResponseEntity<>(new ErrorResponseEntity(status.value(), "参数转换失败"), status);
	}

}
