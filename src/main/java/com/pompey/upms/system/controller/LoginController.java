package com.pompey.upms.system.controller;

import com.pompey.upms.common.result.ResultEnum;
import com.pompey.upms.common.result.ResultInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author PompeyXu
 * @ClassName: LoginController
 * @Description:
 * @date: 2019/7/15 21:09
 */
@RestController
public class LoginController {

    @PostMapping(value = "/login")
    public ResultInfo<Object> login(){
        Map<String, Object> data = new HashMap<String, Object>(16);
        data.put("name", "Admin");
        data.put("password", "admin");
        data.put("token", "8dfhassad0asdjwoeiruty");
        data.put("uuid", "admin-uuid");
        data.put("username", "admin");
        return ResultInfo.success(data, ResultEnum.SUCCESS.getMsg());
    }

    @GetMapping(value = "/info")
    public ResultInfo<Object> info() {
        Map<String, Object> data = new HashMap<String, Object>(16);
        data.put("name", "Admin");
        data.put("password", "admin");
        data.put("token", "8dfhassad0asdjwoeiruty");
        data.put("uuid", "admin-uuid");
        data.put("username", "admin");
        return ResultInfo.success(data, ResultEnum.SUCCESS.getMsg());
    }
}
