package com.ssm.demo.user.dao;

import com.ssm.demo.user.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserDao
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/5/7 0007
 **/
public interface UserDao {

    void insert(User user);

    List<User> selectList(Map<String,Object> param);

}
