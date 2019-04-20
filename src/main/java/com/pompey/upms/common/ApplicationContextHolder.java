package com.pompey.upms.common;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 上下文获取类
 * @author PompeyXu
 * @date 2019-04-21 00:51
 */
public class ApplicationContextHolder implements ApplicationContextAware {

	private static Logger logger = LoggerFactory.getLogger(ApplicationContextHolder.class);
	private static final Map<String, Object> SERVICE_FACTORY = new HashMap<>();
	static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ApplicationContextHolder.applicationContext = applicationContext;
	}

	public static <T> T getBean(Class<T> t) {
		return applicationContext.getBean(t);
	}

	public static <T> Map<String, T> getBeansOfType(Class<T> t) {
		return applicationContext.getBeansOfType(t);
	}

	public static Object getBean(String name) {
		return applicationContext.getBean(name);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getService(Class<T> cls) {
		String clsName = cls.getName();
		T service = (T)SERVICE_FACTORY.get(clsName);
		if(service == null) {
			service = ApplicationContextHolder.getBean(cls);
			SERVICE_FACTORY.put(clsName, service);
		}
		return service;
	}
	
}
