package com.huzhongyu.service.impl;

import com.huzhongyu.dao.HouseDao;
import com.huzhongyu.entity.House;
import com.huzhongyu.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("HouseService")
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseDao houseDao;

    @Override
    public List<House> getOccupancyList(int userId,int start,int pageNum) {
        return houseDao.userQueryOccupancy(userId, start, pageNum);
    }

    @Override
    public List<House> getVacantList(int userId,int start,int pageNum) {
        return houseDao.userQueryVacant(userId, start, pageNum);
    }

    @Override
    public House getHouseById(int id) {
        return houseDao.queryById(id);
    }

    @Override
    public int getCountAll(int userId) {
        return houseDao.userQueryCountAll(userId);
    }

    @Override
    public int getCountOccupancy(int userId) {
        return houseDao.userQueryCountOccupancy(userId);
    }

    @Override
    public void updateById(String id,String name,String city,String community,
                           String room,String area,String type) {
        houseDao.updateHouse(id, name, city, community, room, area, type);
    }

    @Override
    public void deleteById(int id) {
        houseDao.userDeleteById(id);
    }

    @Override
    public void addHouse(int userId,String name,String city,String community,
                         String room,String area,String type){
        houseDao.userAddHouse(userId,name,city,community,room,area,type);
    }

    @Override
    public void checkIn(int id) {
        houseDao.checkIn(id);
    }

    @Override
    public void checkOut(int id) {
        houseDao.checkOut(id);
    }

    @Override
    public List<House> queryByCity(String city) {
        return houseDao.queryByCity(city);
    }

    @Override
    public List<House> queryByCommunity(String community) {
        return houseDao.queryByCommunity(community);
    }

    @Override
    public List<House> queryByUid(String uid) {
        return houseDao.queryByUid(uid);
    }
}
