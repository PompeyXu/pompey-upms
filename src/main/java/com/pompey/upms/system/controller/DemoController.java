package com.pompey.upms.system.controller;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.pompey.upms.exception.CustomException;
import com.pompey.upms.system.model.DemoVo;
import com.pompey.upms.system.service.IDemoService;

/**
 * @ClassName: DemoController
 * @Description: 测试controller 
 * @author PompeyXu
 * @date: 2019-04-09 21:38
 *
 */
@RestController
public class DemoController {

	@Autowired
	IDemoService demoService;
	
	@GetMapping("/test")
    public String test(Integer num) {
        if (num == null) {
            throw new CustomException(400, "num不能为空");
        }
        int i = 10 / num;
        return "result:" + i;
    }
	
	@GetMapping("/time")
    public Object time() {
		DemoVo vo = new DemoVo();
		vo.setUpdateDateTime(LocalDateTime.now());
		vo.setCrateDateTime(new Date());
        return vo;
    }
	@GetMapping("/list")
	public Object list() {
		PageInfo<DemoVo> data = demoService.getList();
		return data;
	}
	
	@GetMapping("/getuser/{id}")
	public Object getUser(@PathVariable(name = "id")String resourceId) {
		return demoService.getUserInfoById(resourceId);
	}
}
