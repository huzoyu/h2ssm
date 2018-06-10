package com.huzhongyu.service;

import com.huzhongyu.entity.User;

import java.util.List;

public interface UserService {



    //获取所有用户信息
    List<User> getList(int start, int pageNum);

    //创建用户
    int addUser(String name,String password);

    //修改用户信息
    int updateUser(String id,String password);

    //通过id获取用户信息
    User queryById(String id);
}
