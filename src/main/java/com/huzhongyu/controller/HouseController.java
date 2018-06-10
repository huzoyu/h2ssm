package com.huzhongyu.controller;

import com.huzhongyu.entity.House;
import com.huzhongyu.service.AgreementService;
import com.huzhongyu.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/house")
public class HouseController {

    @Autowired
    protected HouseService houseService;

    @Autowired
    protected AgreementService agreementService;

    @RequestMapping(value = "/occupancylist")
    public String occupancyList(Model model, HttpSession session){
        int userId = (Integer) session.getAttribute("userid");
        System.out.println("userid="+userId);
        List<House> list = houseService.getOccupancyList(userId,0,1000);
        model.addAttribute("list",list);
        return "occupancyhouse";
    }

    @RequestMapping(value = "/vacantlist")
    public String vacantList(Model model,HttpSession session){
        int userId = (Integer) session.getAttribute("userid");
        System.out.println("userid="+userId);
        List<House> list = houseService.getVacantList(userId,0,1000);
        model.addAttribute("list",list);
        return "vacanthouse";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String deleteById(@PathVariable("id") int id){
        agreementService.deleteAgreementByHouseId(id);
        houseService.deleteById(id);
        return "forward:/home/rate";
    }

    @RequestMapping(value = "newhouse")
    public String newHouse(){
        return "newhouse";
    }

    @RequestMapping(value = "addhouse",method = RequestMethod.POST)
    public String addHouse(HttpServletRequest request,HttpSession session){
        int userId = (Integer) session.getAttribute("userid");
        System.out.println(request.getParameter("name"));
        houseService.addHouse(userId,request.getParameter("name"),request.getParameter("city"),
                request.getParameter("community"),request.getParameter("room"),
                request.getParameter("area"), request.getParameter("type"));
        return "forward:/house/vacantlist";
    }

    @RequestMapping(value = "checkin/{id}",method = RequestMethod.GET)
    public String checkIn(@PathVariable("id") int id){
        houseService.checkIn(id);
        return "forward:/house/vacantlist";
    }

    @RequestMapping(value = "checkout/{id}",method = RequestMethod.GET)
    public String chechkOut(@PathVariable("id") int id){
        houseService.checkOut(id);
        return "forward:/house/occupancylist";
    }

    @RequestMapping(value = "updatehouse/{id}",method = RequestMethod.GET)
    public String updatehouse(@PathVariable("id") int id,Model model){
        House house = houseService.getHouseById(id);
        model.addAttribute("house",house);
        return "updatehouse";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(HttpServletRequest request,HttpSession session){
        houseService.updateById(request.getParameter("id"),request.getParameter("name"),request.getParameter("city"),
                request.getParameter("community"),request.getParameter("room"),request.getParameter("area"),
                request.getParameter("type"));
        return "forward:/home/rate";
    }

}
