package com.huzhongyu.controller;


import com.huzhongyu.entity.User;
import com.huzhongyu.service.LoginService;
import com.huzhongyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    protected HttpSession session;
    @Autowired
    protected HttpServletRequest request;

    @Autowired
    private LoginService loginService;
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/home")
    public String home(HttpServletRequest request){
        return  "home";
    }

    @RequestMapping("/logincheck")
    public String checkLogin(HttpSession session,HttpServletRequest request) throws IOException{
        User user = loginService.loginCheck(request.getParameter("name"),request.getParameter("password"));
        System.out.println("name:" + request.getParameter("name"));
        if(user != null){
            session.setAttribute("username",user.getName());
            session.setAttribute("userid",user.getId());
            return "success";
        }else {
            request.setAttribute("error", "用户名或密码错误");
            return "error";
        }
    }

    @RequestMapping("/signup")
    public String signup(){
        return "signup";
    }

    @RequestMapping("/btnsignup")
    @ResponseBody
    public String btnsignup(HttpServletRequest request,HttpSession session){

        int flag = loginService.ifExist(request.getParameter("name"));
        if(flag==1){
            return "用户名已存在！";
        }else{
            userService.addUser(request.getParameter("name"),request.getParameter("password"));
            return "用户已创建，请返回登录。";
        }

    }

    @RequestMapping("/outlogin")
    public String outlogin(HttpSession session){
        session.invalidate();;
        return "login";
    }


}
