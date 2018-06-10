package com.huzhongyu.service.impl;

import com.huzhongyu.dao.UserDao;
import com.huzhongyu.entity.User;
import com.huzhongyu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserDao userDao;

    @Override
    public User loginCheck(String name, String password) {
        User user = userDao.queryByName(name);
        if(user != null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

    @Override
    public int ifExist(String name) {
        if(userDao.queryByName(name)!=null){
            return 1;
        }else{
            return 0;
        }
    }
}
