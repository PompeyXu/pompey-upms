package com.pompey.upms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;

/**
 * MybatisPlus插件配置
 * @author PompeyXu
 * @date 2019-04-20 18:49
 *
 */
@Configuration
public class MybatisPlusConfig {

	/**
	 * 分页插件，自动识别数据库类型
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor page = new PaginationInterceptor();
		page.setDialectType("mysql");
		return page;
	}
	
	@Bean
	public PerformanceInterceptor performanceInterceptor() {
		PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
		 /**
		  * SQL 执行性能分析，开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长 
		  */
        performanceInterceptor.setMaxTime(1000);
        /**
         * SQL是否格式化 默认false
         */
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
	}
	
}
