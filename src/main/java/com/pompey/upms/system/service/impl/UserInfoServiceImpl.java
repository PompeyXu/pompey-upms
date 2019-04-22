package com.pompey.upms.system.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pompey.upms.system.entity.UserInfoVo;
import com.pompey.upms.system.mapper.UserInfoMapper;
import com.pompey.upms.system.service.IUserInfoService;

/**
 * 用户表Service
 * 
 * @author PompeyXu
 * @date 2019-04-08 23:49:37  
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfoVo> implements IUserInfoService {

}
