package com.pompey.upms.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.system.entity.DictData;
import com.pompey.upms.system.service.impl.DictDataServiceImpl;
import io.swagger.annotations.Api;

/**
 * 字典数据表 前端控制器
 * @author PompeyXu
 * @since 2019-04-21
 */
@Api(value = "字典管理", tags = {"字典操作接口"})
@RestController
@RequestMapping("/system/dictData")
public class DictDataController extends BaseController<DictData, DictDataServiceImpl>{

}
