package com.frank.multiple.data.test;


import com.frank.multiple.data.mapper.master.MasterUserMapper;
import com.frank.multiple.data.mapper.slave.SlaveUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.frank.multiple.data.MultipleDataApplication;
import com.frank.multiple.data.pojo.User;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-multiple-data
 * @package: com.frank.multiple.data.test、
 * @email: cy880708@163.com
 * @date: 2019/5/14 下午3:48
 * @mofified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MultipleDataApplication.class)
public class MultiDataSourceTest {

    /**
     * 主数据源
     */
    @Autowired
    private MasterUserMapper masterUserMapper;

    /**
     * 从数据源
     */
    @Autowired
    private SlaveUserMapper slaveUserMapper;

    /**
     * 插入用户
     * @throws Exception
     */
    @Test
    public void testInsertUser() throws Exception {
        User masterUser = new User();
        masterUser.setId(1L);
        masterUser.setAge(10);
        masterUser.setName("弗兰克");
        int masterInsertCount = masterUserMapper.addUser(masterUser);
        System.out.println("masterUser 新增数据条目数 ==>"+ masterInsertCount);

        User slaveUser = new User();
        slaveUser.setId(1L);
        slaveUser.setAge(20);
        slaveUser.setName("弗兰克20岁");
        int slaveInsertCount = slaveUserMapper.addUser(slaveUser);
        System.out.println("slaveUser 新增数据条目数 ==>"+ slaveInsertCount);
    }

    /**
     * 查询用户
     * @throws Exception
     */
    @Test
    public void testQueryUser() throws Exception {
        User masterUser = masterUserMapper.queryUserById(1L);
        System.out.println("masterUser==>"+masterUser.getName());

        User slaverUser = slaveUserMapper.queryUserById(1L);
        System.out.println("slaverUser==>"+slaverUser.getName());
    }

}
