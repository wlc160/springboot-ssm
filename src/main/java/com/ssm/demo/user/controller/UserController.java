package com.ssm.demo.user.controller;

import com.ssm.demo.dto.StatusRes;
import com.ssm.demo.user.pojo.User;
import com.ssm.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/5/7 0007
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add")
    @ResponseBody
    public StatusRes add(User user){
        try{
            userService.insert(user);
            return StatusRes.build(true,"SUCCESS",null);
        }catch (Exception e){
            return StatusRes.build(false,"保存失败",null);
        }
    }

    @GetMapping(value = "/query")
    @ResponseBody
    public StatusRes query(){
        try{
            Map<String,Object> param = new HashMap<>();
            List<User> users = userService.select(param);
            return StatusRes.build(true,"SUCCESS",users);
        }catch (Exception e){
            return StatusRes.build(false,"查询失败",null);
        }
    }


}
