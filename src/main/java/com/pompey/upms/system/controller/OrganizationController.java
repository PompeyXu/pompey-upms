package com.pompey.upms.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.system.entity.Organization;
import com.pompey.upms.system.service.impl.OrganizationServiceImpl;
import io.swagger.annotations.Api;

/**
 * <p>
 * 公司表 前端控制器
 * </p>
 *
 * @author PompeyXu
 * @since 2019-04-21
 */
@Api(value = "组织管理", tags = {"组织操作接口"})
@RestController
@RequestMapping("/system/organization")
public class OrganizationController extends BaseController<Organization, OrganizationServiceImpl>{

}
