package com.pompey.upms.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import com.alibaba.druid.pool.DruidDataSource;

import io.shardingsphere.api.config.rule.MasterSlaveRuleConfiguration;

/**
 * 数据源配置读取
 * @author Pompey
 *
 */
@ConfigurationProperties(prefix = "sharding.jdbc")
public class ShardingMasterSlaveConfig {
	
	private Map<String, DruidDataSource> dataSources = new HashMap<>();

    private MasterSlaveRuleConfiguration masterSlaveRule;
    
    private DruidDataSource druidDataSource;

	public Map<String, DruidDataSource> getDataSources() {
		return dataSources;
	}

	public void setDataSources(Map<String, DruidDataSource> dataSources) {
		this.dataSources = dataSources;
	}

	public MasterSlaveRuleConfiguration getMasterSlaveRule() {
		return masterSlaveRule;
	}

	public void setMasterSlaveRule(MasterSlaveRuleConfiguration masterSlaveRule) {
		this.masterSlaveRule = masterSlaveRule;
	}

	public DruidDataSource getDruidDataSource() {
		return druidDataSource;
	}

	public void setDruidDataSource(DruidDataSource druidDataSource) {
		this.druidDataSource = druidDataSource;
	}
    
    
}
