package com.pompey.upms.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.system.entity.DictType;
import com.pompey.upms.system.service.impl.DictTypeServiceImpl;
import io.swagger.annotations.Api;

/**
 * <p>
 * 字典类型表 前端控制器
 * </p>
 *
 * @author PompeyXu
 * @since 2019-04-21
 */
@Api(value = "字典管理", tags = {"字典类型操作接口"})
@RestController
@RequestMapping("/system/dictType")
public class DictTypeController extends BaseController<DictType, DictTypeServiceImpl>{

}
