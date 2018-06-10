package com.huzhongyu.dao;

import com.huzhongyu.entity.House;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseDao {

    /**
     * 添加房源
     */
    int userAddHouse(@Param("userId") int userId,@Param("name") String name,@Param("city") String city,
                     @Param("community") String community,@Param("room") String room,
                     @Param("area") String area,@Param("type") String type);

    /**
     * 通过houseId查询房源信息
     */
    House queryById(@Param("id") int id);

    /**
     * 更新房源信息
     */
    int updateHouse(@Param("id") String id,@Param("name") String name,@Param("city") String city,
                    @Param("community") String community,@Param("room") String room,
                    @Param("area") String area,@Param("type") String type);

    /**
     * 查找所有房源信息
     */
    List<House> userQueryAll(@Param("userId") int userId,@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 已租房源，入住
     */
    List<House> userQueryOccupancy(@Param("userId") int userId,@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 待租房源，空置
     */
    List<House> userQueryVacant(@Param("userId") int userId,@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 入住房源数
     */
    int userQueryCountOccupancy(@Param("userId") int userId);

    /**
     * 总房源数
     */
    int userQueryCountAll(@Param("userId") int userId);

    /**
     * 登记入住
     */
    int checkIn(@Param("id") int id);

    /**
     * 退租
     */
    int checkOut(@Param("id") int id);

    /**
     * 删除房源信息
     */
    int userDeleteById(@Param("id") int id);

    /**
     * 更新房源信息
     */
    int update(@Param("house") House house);

    /**
     * 通过城市查房源列表
     */
    List<House> queryByCity(@Param("city") String city);

    /**
     * 通过小区查房源列表
     */
    List<House> queryByCommunity(@Param("community") String community);

    /**
     * 通过uid查房源列表
     */
    List<House> queryByUid(@Param("uid") String uid);
}
