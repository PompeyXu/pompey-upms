package com.pompey.upms.utils;

import com.pompey.upms.BaseTest;
import com.pompey.upms.common.utils.TreeUtil;
import com.pompey.upms.system.entity.Organization;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PompeyXu
 * @ClassName: TreeUtilTest
 * @Description:
 * @date: 2019/7/14 23:57
 */
public class TreeUtilTest extends BaseTest{

    @Test
    public void TestTree(){
        List<Organization> list = new ArrayList<>();

        Organization org1 = new Organization();
        org1.setResourceId("1");
        org1.setParentId("0");
        org1.setOrgName("第一层1");
        org1.setSortNumber(1);

        Organization org2 = new Organization();
        org2.setResourceId("2");
        org2.setParentId("0");
        org2.setOrgName("第一层2");
        org2.setSortNumber(2);

        Organization org3 = new Organization();
        org3.setResourceId("3");
        org3.setParentId("1");
        org3.setOrgName("第一层第一层");
        org3.setSortNumber(2);

        Organization org4 = new Organization();
        org4.setResourceId("4");
        org4.setParentId("1");
        org4.setOrgName("第一层第二层");
        org4.setSortNumber(1);

        list.add(org1);
        list.add(org2);
        list.add(org3);
        list.add(org4);

        List<Organization> tree = TreeUtil.createTree("0", list.stream().collect(Collectors.groupingBy(Organization::getParentId)));
        System.out.println(tree);
    }

}
