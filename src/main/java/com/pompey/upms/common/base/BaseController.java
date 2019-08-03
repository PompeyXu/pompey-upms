package com.pompey.upms.common.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.pompey.upms.common.utils.ClassUtil;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pompey.upms.common.result.ResultEnum;
import com.pompey.upms.common.result.ResultInfo;
import com.pompey.upms.support.ApplicationContextHolder;

/**
 * @Description 控制基础类
 * @Author PompeyXu
 * @Param
 * @return
 **/
@Api(value = "系统配置", tags = {"系统配置操作接口"})
@Slf4j
public class BaseController<T extends Serializable, S extends IService<T>> {

	protected S service;

	/**
	 * @Description 构造函数
	 * @Author PompeyXu
	 * @Param []
	 * @return
	 **/
	public BaseController() {
		ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
		Class<?> cls = (Class<?>) type.getActualTypeArguments()[1];
		try {
			service = (S) ApplicationContextHolder.getService(cls);
		} catch (Exception e) {
			log.error("afterPropertiesSet get service error：：：", e);
		}
	}
	
	@ApiOperation(value = "分页列表方法")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "第几页", dataType = "int", required = true, defaultValue = "1", example = "1"),
			@ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", required = true, defaultValue = "10", example = "10") })
	@GetMapping("/pagelist/{page}/{pageSize}")
	public ResultInfo<Object> pagelist(@PathVariable("page") int page, @PathVariable("pageSize") int pageSize, T entity) {
		QueryWrapper<T> query = new QueryWrapper<>();
		query.allEq(true, BeanUtils.beanToMap(entity), false);
		IPage<T> data = service.page(new Page<>(page, pageSize), query);
		return ResultInfo.success(data, ResultEnum.SUCCESS.getMsg());
	}

	@ApiOperation(value = "分页列表方法")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "第几页", dataType = "int", required = true, defaultValue = "1", example = "1"),
			@ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", required = true, defaultValue = "10", example = "10") })
	@GetMapping("/page")
	public ResultInfo<Object> page(@ApiParam(name="page",value="第几页",required=true) @RequestParam(name = "page", defaultValue = "0") int page,
								   @ApiParam(name="limit",value="一页多少条",required=true) @RequestParam(name = "limit", defaultValue = "10") int pageSize,
								   @ApiParam(name="order",value="排序方式(asc/desc)") @RequestParam(name = "order", defaultValue = "") String order,
								   @ApiParam(name="orderField",value="排序字段") @RequestParam(name = "orderField", defaultValue = "") String orderField,
								   T dataForm) {
		QueryWrapper<T> query = new QueryWrapper<>();
		query.allEq(true, BeanUtils.beanToMap(dataForm), false)
				.orderBy(true, true, orderField);
		IPage<T> data = service.page(new Page<>(page, pageSize), query);
		return ResultInfo.success(data, ResultEnum.SUCCESS.getMsg());
	}

	
	@ApiOperation("根据id获取数据")
	@ApiImplicitParam(name = "resourceId", value = "数据id", dataType = "string", required = true)
	@GetMapping("/getdata/{resourceId}")
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
