package com.pompey.upms.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.system.entity.Menu;
import com.pompey.upms.system.service.impl.MenuServiceImpl;
import io.swagger.annotations.Api;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author PompeyXu
 * @since 2019-04-21
 */
@Api(value = "菜单管理", tags = {"菜单操作接口"})
@RestController
@RequestMapping("/system/menu")
public class MenuController extends BaseController<Menu, MenuServiceImpl>{

}
