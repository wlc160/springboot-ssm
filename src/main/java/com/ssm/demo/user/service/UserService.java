package com.ssm.demo.user.service;

import com.ssm.demo.user.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/5/8 0008
 **/
public interface UserService {

    void insert(User user);

    List<User> select(Map<String,Object> param);

}
