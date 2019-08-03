package com.pompey.upms.support;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * 上下文获取类
 * 
 * @author PompeyXu
 * @date 2019-04-21 00:51
 */
@Component
public class ApplicationContextHolder implements ApplicationContextAware {

	private static final Map<String, Object> SERVICE_FACTORY = new HashMap<>();
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ApplicationContextHolder.applicationContext = applicationContext;
	}
	
	/**
	 * 获得applicationContext
	 */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

	private static <T> T getBean(Class<T> t) {
		return applicationContext.getBean(t);
	}

	public static <T> Map<String, T> getBeansOfType(Class<T> t) {
		return applicationContext.getBeansOfType(t);
	}

	public static Object getBean(String name) {
		return applicationContext.getBean(name);
	}

	public static <T> T getService(@NotNull Class<T> cls) {
		String clsName = cls.getName();
		T service = (T) SERVICE_FACTORY.get(clsName);
		if (service == null) {
			service = ApplicationContextHolder.getBean(cls);
			SERVICE_FACTORY.put(clsName, service);
		}
		return service;
	}

}
