package com.pompey.upms.common.utils;

import com.pompey.upms.system.entity.Organization;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author PompeyXu
 * @ClassName: TreeUtil
 * @Description:
 * @date: 2019/7/14 18:22
 */
public class TreeUtil<T> {

    public static<T> List<T> createTree(Object pid, Map<Object, List<T>> map){
        return Optional.ofNullable(map.get(pid)).orElseGet(()->new ArrayList<T>()).stream().filter(x->{
            Object parentId = ClassUtil.getAttributeValue(x,"parentId");
            return parentId.equals(pid);
        }).sorted((x, y)->{
            Integer xSortNo = (Integer) ClassUtil.getAttributeValue(x,"sortNumber");
            Integer ySortNo = (Integer) ClassUtil.getAttributeValue(y,"sortNumber");
            return xSortNo.compareTo(ySortNo);
        }).map(x->{
            T y = null;
            try {
               y = (T)x.getClass().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            BeanUtils.copyProperties(x,y);
            Object parentId = ClassUtil.getAttributeValue(y,"resourceId");
            ClassUtil.setAttributeValue(y, createTree(parentId, map),"children");
            return y;
        }).collect(Collectors.toList());
    }
}
