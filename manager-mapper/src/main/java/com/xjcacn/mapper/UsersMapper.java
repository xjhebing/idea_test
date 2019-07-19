package com.xjcacn.mapper;

import com.xjcacn.pojo.Users;

import java.util.List;

/**
 * @Auther: http://www.xjcacn.com
 * @Date:2019/7/16
 * @Description:com.xjcacn.mapper
 * @version:1.0
 */
public interface UsersMapper {
    void InsertUser(Users user);
    List<Users> selectUserAll();
}
