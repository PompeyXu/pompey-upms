package com.pompey.upms.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;

/**
 * MybatisPlus插件配置
 * 
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
		PaginationInterceptor paginationInterceptor = new PaginationInterceptor();

		List<ISqlParser> sqlParser = new ArrayList<ISqlParser>();
		// 攻击 SQL 阻断解析器、加入解析链
		sqlParser.add(new BlockAttackSqlParser());
		paginationInterceptor.setSqlParserList(sqlParser);

		paginationInterceptor.setDialectType("mysql");
		return paginationInterceptor;
	}

	/**
	 * 逻辑删除插件
	 * 在vo上逻辑删除字段上添加 @TableLogic 
	 */
	@Bean
	public ISqlInjector sqlInjector() {
		return new LogicSqlInjector();
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
