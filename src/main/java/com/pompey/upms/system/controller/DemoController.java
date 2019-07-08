package com.pompey.upms.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pompey.upms.exception.CustomException;
import com.pompey.upms.system.entity.Demo;
import com.pompey.upms.system.service.IDemoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

	@GetMapping("/userInfo/{id}")
	public Mono<Demo> userInfo(@PathVariable("id") String id) {
		return Mono.create(t->t.success(demoService.getUserInfoById(id)));
	}
	
	@GetMapping("/list")
	public Flux<Demo> list(){
		return Flux.fromIterable(demoService.list());
	}
	
	@GetMapping("/page")
	public Mono<Object> page(){
		return Mono.create(t->t.success(demoService.page(new Page<Demo>(1, 2))));
	}
	
}
