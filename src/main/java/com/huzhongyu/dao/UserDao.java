package com.huzhongyu.dao;

import com.huzhongyu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    /**
     * 通过id查询用户
     *
     * @param id
     * @return
     */
    User queryById(String id);

    /**
     * 通过name查询用户
     *
     * @param name
     * @return
     */
    User queryByName(String name);

    /**
     * 查询所有用户
     *
     * @param offset
     * @param limit
     * @return
     */
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 添加用户
     *
     * @param name
     * @param password
     * @return
     */
    int addUser(@Param("name") String name,@Param("password") String password);

    /**
     * 更新用户密码
     *
     * @param id
     * @param password
     * @return
     */
    int updateUser(@Param("id") String id,@Param("password") String password);

}
