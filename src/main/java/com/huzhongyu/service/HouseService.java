package com.huzhongyu.service;

import com.huzhongyu.entity.House;

import java.util.List;

public interface HouseService {

    //已租房源列表
    public List<House> getOccupancyList(int userId,int start,int pageNum);

    //未租房源列表
    public List<House> getVacantList(int userId,int start,int pageNum);

    //通过id查找房源信息
    public House getHouseById(int id);

    //用户所有房源数量
    public int getCountAll(int userId);

    //用户已租房源数量
    public int getCountOccupancy(int userId);

    //登记入住，将房源状态改为已租
    public void checkIn(int id);

    //退租，将房源状态改为未租
    public void checkOut(int id);

    //通过房源id删除房源
    public void deleteById(int id);

    //通过房源id更新房源
    public void updateById(String id,String name,String city,String community,
                           String room,String area,String type);

    //添加房源
    public void addHouse(int userId,String name,String city,String community,
                         String room,String area,String type);

    //按城市查找房源
    public List<House> queryByCity(String city);

    //按小区查找房源
    public List<House> queryByCommunity(String Community);

    //按uid查找房源
    public List<House> queryByUid(String uid);
}
