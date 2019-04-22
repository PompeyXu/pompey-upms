package com.pompey.upms.system.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pompey.upms.system.entity.MenuVo;
import com.pompey.upms.system.mapper.MenuMapper;
import com.pompey.upms.system.service.IMenuService;

/**
 * 菜单表Service
 * 
 * @author PompeyXu
 * @date 2019-04-11 23:18:03  
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuVo> implements IMenuService {

}
