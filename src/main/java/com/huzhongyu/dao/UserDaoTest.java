package com.huzhongyu.dao;

import com.huzhongyu.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})

public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testQueryById() throws Exception {
        String uId = "1";
        User user = userDao.queryById(uId);
        System.out.println(user);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<User> users = userDao.queryAll(0, 4);
        for (User user : users) {
            System.out.println(user);
        }
    }



}


