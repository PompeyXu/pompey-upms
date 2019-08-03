package com.pompey.upms.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.system.entity.Role;
import com.pompey.upms.system.service.impl.RoleServiceImpl;
import io.swagger.annotations.Api;

/**
 * 角色表 前端控制器
 * @author PompeyXu
 * @since 2019-04-21
 */
@Api(value = "角色管理", tags = {"角色操作接口"})
@RestController
@RequestMapping("/system/role")
public class RoleController extends BaseController<Role, RoleServiceImpl>{

}
