package org.derekframe.modules.sys.service.impl;

import org.derekframe.modules.sys.entity.User;
import org.derekframe.modules.sys.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 描述:
 * User shuaibo
 * Date 2016/5/3
 * Version: V1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/applicationContext-*.xml"})
public class TestUser {
    @Autowired
    private IUserService iUserService;

    @Test
    public void addUserTest(){
        User user = new User();
        user.setUsername("jjjjj");
        user.setPassword("123");
        user.setUserType("1");
        iUserService.addUser(user);
    }

    @Test
    public void test1(){

    }


}
