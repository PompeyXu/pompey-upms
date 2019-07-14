package com.pompey.upms.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

/**
 * @author PompeyXu
 * @ClassName: ClassUtil
 * @Description: 反射处理类
 * @date: 2019/7/14 19:12
 */
@Slf4j
public class ClassUtil {

    /**
     * @Description 获取字段值
     * @Author PompeyXu
     * @Param [cls, fieldName]
     * @return java.lang.Object
     **/
    public static Object getAttributeValue(Object obj, String fieldName){
        Object invoke = null;
        Method[] methods = obj.getClass().getMethods();
        Optional<Method> optionslMethod = Arrays.stream(methods).filter(x -> ("get" + fieldName).equalsIgnoreCase(x.getName())).findFirst();
        try {
            Method method = optionslMethod.get();
            invoke = method.invoke(obj);
        } catch (Exception e) {
            log.error("反射获取字段值错误！",e);
        }
        return invoke;
    }

    /**
     * @Description 设置字段值
     * @Author PompeyXu
     * @Param [cls, object, fieldName]
     * @return java.lang.Object
     **/
    public static Object setAttributeValue(Object entity,Object value, String fieldName){
        Object invoke = null;
        Method[] methods = entity.getClass().getMethods();
        Optional<Method> method = Arrays.stream(methods).filter(x -> ("set" + fieldName).equalsIgnoreCase(x.getName())).findFirst();
        try {
            invoke = method.get().invoke(entity, value);
        } catch (Exception e) {
            log.error("反射设置字段值错误！",e);
        }
        return invoke;
    }
}
