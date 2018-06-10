package com.huzhongyu.controller;

import com.huzhongyu.entity.Agreement;
import com.huzhongyu.entity.House;
import com.huzhongyu.service.AgreementService;
import com.huzhongyu.service.HouseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("agreement")
public class AgreementController {

    @Autowired
    protected HouseService houseService;

    @Autowired
    protected AgreementService agreementService;

    @RequestMapping(value = "/newagreement/{houseId}",method = RequestMethod.GET)
    public String newAgreement(@PathVariable("houseId") int houseId, Model model){
        model.addAttribute("houseId",houseId);
        return "newagreement";
    }

    @RequestMapping(value = "addagreement",method = RequestMethod.POST)
    public String addAgreement(HttpServletRequest request, HttpSession session){
        System.out.println(request.getParameter("name"));
        int houseId =Integer.parseInt(request.getParameter("houseId"));
        //写多余了，不影响功能，暂时留着
        House house = houseService.getHouseById(houseId);
        System.out.println(house.getName());
        agreementService.addAgreement(Integer.toString(house.getId()),request.getParameter("tenantName"),request.getParameter("tenantPhone"),
                request.getParameter("startDate"),request.getParameter("period"),
                request.getParameter("deposit"), request.getParameter("rent"));
        return "forward:/house/vacantlist";
    }

    @RequestMapping(value = "/updateagreement/{agreementId}",method = RequestMethod.GET)
    public String updateAgreement(@PathVariable("agreementId") int agreementId,Model model){
        Agreement agreement = agreementService.selectById(agreementId);
        model.addAttribute("agreement",agreement);
        return "updateagreement";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(HttpServletRequest request,HttpSession session){

        System.out.printf(request.getParameter("id"));
        agreementService.updateAgreement(request.getParameter("id"),request.getParameter("tenantName"),request.getParameter("tenantPhone"),
                request.getParameter("startDate"),request.getParameter("period"),
                request.getParameter("deposit"), request.getParameter("rent"));
        return "forward:/home/rate";
    }



    @RequestMapping(value = "history/{houseId}",method = RequestMethod.GET)
    public String history(@PathVariable("houseId") int houseId,Model model){
        List<Agreement> list = agreementService.queryAllByHouseId(houseId,0,1000);
        model.addAttribute("list",list);
        return "agreementlist";
    }

    @RequestMapping(value = "delete/{agreementId}",method = RequestMethod.GET)
    public String delete(@PathVariable("agreementId") int agreementId){
        agreementService.deleteAgreementById(agreementId);
        return "forward:/home/rate";
    }

    @RequestMapping(value = "citytrend/{houseId}",method = RequestMethod.GET)
    public String citytrend(@PathVariable("houseId") int houseId, Model model){
        String city = houseService.getHouseById(houseId).getCity();
        List<House> houseList = houseService.queryByCity(city);
        List<Agreement> agreementList = new LinkedList<Agreement>();
        for(int i=0;i<houseList.size();i++){
            agreementList.addAll(agreementService.queryAllByHouseId(houseList.get(i).getId(),0,1000));
        }
        model.addAttribute("list",agreementList);
        return "citytrend";
    }

    @RequestMapping(value = "communitytrend/{houseId}",method = RequestMethod.GET)
    public String communitytrend(@PathVariable("houseId") int houseId,Model model){
        String community = houseService.getHouseById(houseId).getCommunity();
        List<House> houseList = houseService.queryByCommunity(community);
        List<Agreement> agreementList = new LinkedList<Agreement>();
        for(int i=0;i<houseList.size();i++){
            agreementList.addAll(agreementService.queryAllByHouseId(houseList.get(i).getId(),0,1000));
        }
        model.addAttribute("list",agreementList);
        return "communitytrend";
    }

    @RequestMapping(value = "usertrend")
    public String usertrend(HttpServletRequest request, HttpSession session, Model model){
        String uid = session.getAttribute("userid").toString();
        List<House> houseList = houseService.queryByUid(uid);
        List<Agreement> agreementList = new LinkedList<Agreement>();
        for(int i=0;i<houseList.size();i++){
            agreementList.addAll(agreementService.queryAllByHouseId(houseList.get(i).getId(),0,1000));
        }
        model.addAttribute("list",agreementList);
        return "usertrend";
    }

}
