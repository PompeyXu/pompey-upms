package com.pompey.upms.common.base;

import java.lang.reflect.ParameterizedType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pompey.upms.common.result.ResultInfo;
import com.pompey.upms.support.ApplicationContextHolder;

/**
 * 控制层基类
 * 
 * @author PompeyXu
 * @date 2019-04-21 00:55
 *
 * @param <T>
 * @param <S>
 */
public abstract class BaseController<T extends BaseVo<T>, S extends IService<T>> {
	private static Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	protected S service;

	@SuppressWarnings("unchecked")
	public BaseController() {
		if (service == null) {
			ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
			Class<?> cls = (Class<?>) type.getActualTypeArguments()[1];
			try {
				service = (S) ApplicationContextHolder.getService(cls);
			} catch (Exception e) {
				logger.error("afterPropertiesSet get service error：：：", e);
			}

		}
	}


//	public ResultInfo<Object> pageList(){
//		service.page
//		
//		return null;
//	}

}
