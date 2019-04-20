package com.pompey.upms.handler;

import java.util.Date;

import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

/**
 * mybatisPlus 自动填充
 * @author PompeyXu
 * @date 2019-04-20 20:06
 *
 */
@Component
public class MybatisPlusMetaObjectHandler implements MetaObjectHandler{
	
	private static final Logger logger = LoggerFactory.getLogger(MybatisPlusMetaObjectHandler.class);

	/**
	 * 插入数据时自动填充创建时间
	 */
	@Override
	public void insertFill(MetaObject metaObject) {
		logger.info("start insert fill ...");
		this.setFieldValByName("createDate", new Date(), metaObject);
	}

	/**
	 * 更新数据时自动填充更新时间
	 */
	@Override
	public void updateFill(MetaObject metaObject) {
		logger.info("start insert fill ...");
		this.setFieldValByName("updateDate", new Date(), metaObject);
		
	}

}
