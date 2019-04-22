package com.pompey.upms.system.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pompey.upms.system.entity.DemoVo;
import com.pompey.upms.system.mapper.DemoMapper;
import com.pompey.upms.system.service.IDemoService;

/**
 * @ClassName: DemoServiceImpl
 * @Description: 测试service
 * @author PompeyXu
 * @date: 2019-04-09 21:37
 *
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, DemoVo> implements IDemoService {

//	private final static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

	@Override
	public DemoVo getUserInfoById(String id) {
		return getBaseMapper().getUserInfoById(id);
	}

	@Override
	public int insert(DemoVo userInfo) {
		return getBaseMapper().insert(userInfo);
	}

//	@Override
//	public PageInfo<DemoVo> getList() {
//		final PageInfo<DemoVo> pageInfo = PageHelper.startPage(1, 10).doSelectPageInfo(() -> this.userinfoMapper.selectAll());
//		
////		 PageHelper.startPage(1, 10).setOrderBy("id desc");
////	     final PageInfo<UserInfo> userPageInfo = new PageInfo<>(this.userinfoMapper.selectAll());
////	     logger.info("[普通写法] - [{}]", userPageInfo);
//		logger.info(pageInfo.toString());
//		return pageInfo;
//		
//		
//	}

}
