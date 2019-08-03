package com.pompey.upms.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.system.entity.UserInfo;
import com.pompey.upms.system.service.impl.UserInfoServiceImpl;

import io.swagger.annotations.Api;

/**
 * 用户信息controller
 * @author PompeyXu
 * @date 2019-04-20 19:53
 *
 */
@Api(value = "用户管理", tags = { "用户操作接口" })
@RestController
@RequestMapping("/system/user")
public class UserInfoController extends BaseController<UserInfo, UserInfoServiceImpl> {


}
