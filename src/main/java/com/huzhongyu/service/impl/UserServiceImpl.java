package com.huzhongyu.service.impl;

import com.huzhongyu.entity.User;
import com.huzhongyu.dao.UserDao;
import com.huzhongyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getList(int start, int pageNum) {
        return userDao.queryAll(start, pageNum);
    }

    @Override
    public int addUser(String name, String password) {
        return userDao.addUser(name,password);
    }

    @Override
    public int updateUser(String id,String password) {
        return userDao.updateUser(id,password);
    }

    @Override
    public User queryById(String id) {
        return userDao.queryById(id);
    }
}
