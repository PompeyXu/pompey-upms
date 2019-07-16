package com.pompey.upms.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pompey.upms.common.result.ResultEnum;
import com.pompey.upms.common.result.ResultInfo;
import com.pompey.upms.common.utils.TreeUtil;
import com.pompey.upms.system.service.IOrganizationService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pompey.upms.common.base.BaseController;
import com.pompey.upms.system.entity.Organization;
import com.pompey.upms.system.service.impl.OrganizationServiceImpl;
import io.swagger.annotations.Api;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * <p>
 * 公司表 前端控制器
 * </p>
 *
 * @author PompeyXu
 * @since 2019-04-21
 */
@Slf4j
@Api(value = "组织管理", tags = {"组织操作接口"})
@RestController
@RequestMapping("/system/organization")
public class OrganizationController extends BaseController<Organization, OrganizationServiceImpl>{

    @Autowired
    IOrganizationService organizationService;

    @ApiOperation("获取组织树")
    @GetMapping("/treelist/{parentId}")
    public ResultInfo<List<Organization>> treelist(@PathVariable("parentId") String parentId) {
        List<Organization> list = null;
        try {
            QueryWrapper queryWrapper = new QueryWrapper();
//            queryWrapper.like("parent_id", parentId);
            List<Organization> sourceData = organizationService.list(queryWrapper);
            list = TreeUtil.createTree(parentId, sourceData.stream().collect(groupingBy(Organization::getParentId)));
        }catch (Exception e){
            log.error("OrganizationController.treelist()",e);
            return ResultInfo.fail(ResultEnum.FAIL.getMsg());
        }
        return ResultInfo.success(list, ResultEnum.SUCCESS.getMsg());
    }
}
