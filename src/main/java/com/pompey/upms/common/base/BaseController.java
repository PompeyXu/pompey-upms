package com.pompey.upms.common.base;

import java.lang.reflect.ParameterizedType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pompey.upms.common.ApplicationContextHolder;

/**
 * 控制层基类
 * @author PompeyXu
 * @date 2019-04-21 00:55
 *
 * @param <T>
 * @param <S>
 */
public abstract class BaseController<T extends BaseVo, S extends ServiceImpl<BaseMapper<T>, T>>
		implements InitializingBean {
	private static Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	protected S service;

	@SuppressWarnings("unchecked")
	@Override
	public void afterPropertiesSet() throws Exception {
		if (service == null) {
			ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
			Class<?> cls = (Class<?>) type.getActualTypeArguments()[1];
			try {
				service = (S) ApplicationContextHolder.getService(cls);
			} catch (Exception e) {
				logger.error("afterPropertiesSet get service error：：：",e);
			}

		}
	}

}
