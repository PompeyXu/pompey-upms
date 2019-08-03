package com.pompey.upms.common.base;

import java.lang.reflect.ParameterizedType;

import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
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
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Flux控制层基类
 * @author PompeyXu
 * @data 2019-07-07 11:25:07
 *
 * @param <T>
 * @param <S>
 */
@Api(value = "系统配置", tags = {"系统配置操作接口"})
public class BaseFluxController<T extends BaseVo<T>, S extends IService<T>> {
	private static Logger logger = LoggerFactory.getLogger(BaseFluxController.class);
	
	protected S service;

	public BaseFluxController() {
		ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
		Class<?> cls = (Class<?>) type.getActualTypeArguments()[1];
		try {
			service = (S) ApplicationContextHolder.getService(cls);
		} catch (Exception e) {
			logger.error("afterPropertiesSet get service error：：：", e);
		}
	}
	
	@ApiOperation(value = "分页列表方法")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "第几页", dataType = "int", required = true, defaultValue = "1", example = "1"),
			@ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", required = true, defaultValue = "10", example = "10") })
	@GetMapping("/pagelist/{page}/{pageSize}")
	public Mono<ResultInfo<Object>> pagelist(@PathVariable("page") int page, @PathVariable("pageSize") int pageSize, T entity) {
		QueryWrapper<T> query = new QueryWrapper<>();
		query.allEq(true, BeanUtils.beanToMap(entity), false);
		IPage<T> data = service.page(new Page<>(page, pageSize), query);
		ResultInfo<Object> resultInfo = ResultInfo.success(data, ResultEnum.SUCCESS.getMsg());
		return Mono.create(pageData->pageData.success(resultInfo));
	}

	@ApiOperation(value = "不分页的查询列表方法")
	@GetMapping("/list")
	public Flux<T> list(T entity){
		QueryWrapper<T> queryWrapper = new QueryWrapper<>();
		return Flux.fromIterable(service.list(queryWrapper));
	}
	
	@ApiOperation("根据id获取数据")
	@ApiImplicitParam(name = "resourceId", value = "数据id", dataType = "string", required = true)
	@GetMapping("/getdata/{resourceId}")
	public Mono<ResultInfo<T>> selectById(@PathVariable("resourceId") String resourceId) {
		return Mono.create(data->data.success(new ResultInfo<T>(service.getById(resourceId))));
	}


	@ApiOperation("添加数据")
	@PostMapping("/insert")
	public Mono<ResultInfo<Object>> insert(T entity) {
		return Mono.create(data->data.success(new ResultInfo<Object>( service.save(entity))));
	}
	
	@ApiOperation("修改数据")
	@ApiImplicitParam(name = "resourceId", value = "数据id", dataType = "string", required = true)
	@PutMapping("/update/{resourceId}")
	public Mono<ResultInfo<Object>> update(@PathVariable("resourceId") String resourceId, T entity) {
		entity.setResourceId(resourceId);
		return Mono.create(data->data.success(new ResultInfo<Object>(service.updateById(entity))));
	}

	@ApiOperation("删除数据")
	@ApiImplicitParam(name = "resourceId", value = "用户数据id", dataType = "string", required = true)
	@DeleteMapping("/delete/{resourceId}")
	public Mono<ResultInfo<Object>> delete(@PathVariable("resourceId") String resourceId) {
		return Mono.create(data->data.success(new ResultInfo<Object>(service.removeById(resourceId))));
	}

	
}
