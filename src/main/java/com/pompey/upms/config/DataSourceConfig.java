package com.pompey.upms.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 数据源配置
 * 
 * @author PompeyXu
 * @date 2019-04-20 18:39
 */
@Configuration
public class DataSourceConfig {

	/**
	 * 配置数据源
	 */
	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "spring.datasource.druid")
	public DataSource dataSource() {
		return new DruidDataSource();
	}

	/**
	 * 配置事物管理器
	 */
	@Bean(name = "transactionManager")
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
}
