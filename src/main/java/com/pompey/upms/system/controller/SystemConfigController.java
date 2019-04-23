package com.pompey.upms.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.system.entity.SystemConfig;
import com.pompey.upms.system.service.impl.SystemConfigServiceImpl;
import io.swagger.annotations.Api;

/**
 * <p>
 * 参数配置表 前端控制器
 * </p>
 *
 * @author PompeyXu
 * @since 2019-04-21
 */
@Api(value = "系统配置", tags = {"系统配置操作接口"})
@RestController
@RequestMapping("/system/systemConfig")
public class SystemConfigController extends BaseController<SystemConfig, SystemConfigServiceImpl>{

}
