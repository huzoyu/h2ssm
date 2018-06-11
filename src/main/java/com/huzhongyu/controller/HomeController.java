package com.huzhongyu.controller;


import com.huzhongyu.entity.User;
import com.huzhongyu.service.HouseService;
import com.huzhongyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private HouseService houseService;

    @RequestMapping("/home")
    public String home(){return "home";}

    @RequestMapping(value="/list",method=RequestMethod.GET)
    public String list(Model model){
        List<User> list = userService.getList(0,100);
        model.addAttribute("list",list);
        return "home";
    }

    @RequestMapping("/newhouse")
    public String newhouse(){return "newhouse";}

    @RequestMapping(value = "/rate")
    public String rate(Model model, HttpSession session){
        int numOccupancy = houseService.getCountOccupancy((Integer) session.getAttribute("userid"));
        int numAll = houseService.getCountAll((Integer) session.getAttribute("userid"));
        model.addAttribute("numOccupancy",numOccupancy);
        model.addAttribute("numAll",numAll);
        return "home";
    }
}
