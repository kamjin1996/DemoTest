package com.elasticsearch.controller;

import com.elasticsearch.dao.User;
import com.elasticsearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: KAM1996
 * @Date: 下午 7:56 2018-09-11
 * @Description: 用户数据接口
 * @Version: 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userlist.do")
    public List<User> select(){
        List<User> select = userService.select();
        return select;
    }
    @RequestMapping("/useradd.do")
    public void intsert(User user){
        User add = userService.add(user);
        System.out.println(user);
    }
    @RequestMapping("/userdel.do")
    public void del(Integer id){
        boolean del = userService.del(id);
        System.out.println(del);
    }

}
