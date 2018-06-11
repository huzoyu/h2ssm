package com.huzhongyu.controller;


import com.huzhongyu.entity.User;
import com.huzhongyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/list",method=RequestMethod.GET)
    public String list(Model model){
        List<User> list = userService.getList(0,100);
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping(value = "/updateuser",method = RequestMethod.POST)
    public String updateuser(HttpSession session, HttpServletRequest request,Model model){
        userService.updateUser(session.getAttribute("userid").toString(),request.getParameter("password"));
        model.addAttribute("result",1);
        return "myprofile";
    }

    @RequestMapping(value = "/myprofile")
    public String myprofile(HttpServletRequest request,HttpSession session,Model model){
        String id = session.getAttribute("userid").toString();
        User user = userService.queryById(id);
        model.addAttribute("user",user);
        return "myprofile";}
}
