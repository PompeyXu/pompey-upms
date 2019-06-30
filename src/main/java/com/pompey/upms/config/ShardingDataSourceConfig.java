package com.pompey.upms.config;

import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.google.common.collect.Maps;

import io.shardingsphere.shardingjdbc.api.MasterSlaveDataSourceFactory;

/**
 * 数据源配置
 * 
 * @author PompeyXu
 * @date 2019-04-20 18:39
 */
@Configuration
@EnableConfigurationProperties(ShardingMasterSlaveConfig.class)
@ConditionalOnProperty({"sharding.jdbc.data-sources.ds_master.url", "sharding.jdbc.master-slave-rule.master-data-source-name"})
public class ShardingDataSourceConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(ShardingDataSourceConfig.class);
	
	@Autowired(required = false)
	private ShardingMasterSlaveConfig shardingMasterSlaveConfig;
	
	/**
	 * 配置数据源
	 * @throws SQLException 
	 */
	@Bean(name = "masterSlaveDataSource")
	public DataSource masterSlaveDataSource() throws SQLException {
		shardingMasterSlaveConfig.getDataSources().forEach((k,v)->configDruidDataSource(v));
		Map<String, DataSource> dataSourceMap = Maps.newHashMap();
		dataSourceMap.putAll(shardingMasterSlaveConfig.getDataSources());
		DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(dataSourceMap, shardingMasterSlaveConfig.getMasterSlaveRule(), Maps.newHashMap(), new Properties());
		logger.info("masterSlaveDataSource config complete");
		return dataSource;
	}
	
	/**
	 * 配置事物管理器
	 */
//	@Bean(name = "transactionManager")
//	public DataSourceTransactionManager transactionManager() {
//		return new DataSourceTransactionManager(dataSource());
//	}

	private void configDruidDataSource(DruidDataSource dataSource) {
		DruidDataSource druidParams = shardingMasterSlaveConfig.getDruidDataSource();
		dataSource.setMaxActive(druidParams.getMaxActive());
		dataSource.setInitialSize(druidParams.getInitialSize());
		dataSource.setMaxWait(druidParams.getMaxWait());
		dataSource.setMinIdle(druidParams.getMinIdle());
		dataSource.setTimeBetweenEvictionRunsMillis(druidParams.getTimeBetweenEvictionRunsMillis());
		dataSource.setMinEvictableIdleTimeMillis(druidParams.getMinEvictableIdleTimeMillis());
		dataSource.setValidationQuery(druidParams.getValidationQuery());
		dataSource.setTestWhileIdle(druidParams.isTestWhileIdle());
		dataSource.setTestOnBorrow(druidParams.isTestOnBorrow());
		dataSource.setTestOnReturn(druidParams.isTestOnReturn());
		dataSource.setPoolPreparedStatements(druidParams.isPoolPreparedStatements());
		dataSource.setMaxOpenPreparedStatements(druidParams.getMaxOpenPreparedStatements());
		dataSource.setUseGlobalDataSourceStat(druidParams.isUseGlobalDataSourceStat());
			
		try {
			dataSource.setFilters("stat,wall,slf4j");
		} catch (SQLException e) {
			logger.error("druid configuration initialization filter", e);
		}
	}
	
}
