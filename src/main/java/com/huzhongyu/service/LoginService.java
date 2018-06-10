package com.huzhongyu.service;

import com.huzhongyu.entity.User;

public interface LoginService {


    //检验用户登录
    public User loginCheck(String name, String password);

    //校验是否存在用户
    public int ifExist(String name);
}
