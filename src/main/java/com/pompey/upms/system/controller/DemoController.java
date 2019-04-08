package com.pompey.upms.system.controller;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pompey.upms.exception.CustomException;
import com.pompey.upms.system.bean.DemoVo;

@RestController
public class DemoController {

	@GetMapping("/test3")
    public String test3(Integer num) {
        if (num == null) {
            throw new CustomException(400, "num不能为空");
        }
        int i = 10 / num;
        return "result:" + i;
    }
	
	@GetMapping("/time")
    public Object test4() {
		DemoVo vo = new DemoVo();
		vo.setUpdateDateTime(LocalDateTime.now());
		vo.setCrateDateTime(new Date());
        return vo;
    }
}
