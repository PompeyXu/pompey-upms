package com.pompey.upms.common.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import com.pompey.upms.common.utils.ClassUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pompey.upms.common.result.ResultEnum;
import com.pompey.upms.common.result.ResultInfo;
import com.pompey.upms.support.ApplicationContextHolder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 控制层基类
 * 
 * @author PompeyXu
 * @date 2019-04-21 00:55
 *
 * @param <T>
 * @param <S>
 */
@Api(value = "系统配置", tags = {"系统配置操作接口"})
public class BaseController<T extends Serializable, S extends IService<T>> {
	private static Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	protected S service;

	/**
	 * @Description 构造函数
	 * @Author PompeyXu
	 * @Param []
	 * @return
	 **/
	public BaseController() {
		if (service == null) {
			ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
			Class<?> cls = (Class<?>) type.getActualTypeArguments()[1];
			try {
				service = (S) ApplicationContextHolder.getService(cls);
			} catch (Exception e) {
				logger.error("afterPropertiesSet get service error：：：", e);
			}
		}
	}
	
	@ApiOperation(value = "分页列表方法")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "第几页", dataType = "int", required = true, defaultValue = "1", example = "1"),
			@ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", required = true, defaultValue = "10", example = "10") })
	@GetMapping("/pagelist/{page}/{pageSize}")
	public ResultInfo<Object> pagelist(@PathVariable("page") int page, @PathVariable("pageSize") int pageSize, T entity) {
		QueryWrapper<T> query = new QueryWrapper<>();
//		query.lambda().eq(StringUtils.isNotBlank(t.getUserName()), UserInfo::getUserName, userInfo.getUserName())
//				.eq(StringUtils.isNotBlank(userInfo.getPassword()), UserInfo::getPassword, userInfo.getPassword());
		IPage<T> data = service.page(new Page<>(page, pageSize), query);
		return ResultInfo.success(data, ResultEnum.SUCCESS.getMsg());
	}

	
	@ApiOperation("根据id获取数据")
	@ApiImplicitParam(name = "resourceId", value = "数据id", dataType = "string", required = true)
	@GetMapping("/getById/{resourceId}")
	public ResultInfo<T> selectById(@PathVariable("resourceId") String resourceId) {
		T resultData = service.getById(resourceId);
		return new ResultInfo<T>(resultData);
	}


	@ApiOperation("添加数据")
	@PostMapping("/insert")
	public ResultInfo<Object> insert(T t) {
		boolean resultStatus = service.save(t);
		return new ResultInfo<Object>(resultStatus);
	}
	
	@ApiOperation("修改数据")
	@ApiImplicitParam(name = "resourceId", value = "数据id", dataType = "string", required = true)
	@PutMapping("/update/{resourceId}")
	public ResultInfo<Object> update(@PathVariable("resourceId") String resourceId, T entity) {
		ClassUtil.setAttributeValue(entity,resourceId,"resourceId");
		boolean resultStatus = service.updateById(entity);
		return new ResultInfo<Object>(resultStatus);
	}

	@ApiOperation("删除数据")
	@ApiImplicitParam(name = "resourceId", value = "用户数据id", dataType = "string", required = true)
	@DeleteMapping("/delete/{resourceId}")
	public ResultInfo<Object> delete(@PathVariable("resourceId") String resourceId) {
		boolean resultStatus = service.removeById(resourceId);
		return new ResultInfo<Object>(resultStatus);
	}

	
}
