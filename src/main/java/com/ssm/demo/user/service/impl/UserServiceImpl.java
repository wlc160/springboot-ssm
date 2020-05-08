package com.ssm.demo.user.service.impl;

import com.ssm.demo.user.dao.UserDao;
import com.ssm.demo.user.pojo.User;
import com.ssm.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/5/8 0008
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public List<User> select(Map<String, Object> param) {
        return userDao.selectList(param);
    }
}
