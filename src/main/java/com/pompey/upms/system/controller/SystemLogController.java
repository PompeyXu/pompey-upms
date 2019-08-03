package com.pompey.upms.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.system.entity.SystemLog;
import com.pompey.upms.system.service.impl.SystemLogServiceImpl;
import io.swagger.annotations.Api;

/**
 * 操作日志表 前端控制器
 * @author PompeyXu
 * @since 2019-04-21
 */
@Api(value = "日志管理", tags = {"操作日志接口"})
@RestController
@RequestMapping("/system/systemLog")
public class SystemLogController extends BaseController<SystemLog, SystemLogServiceImpl>{

}
