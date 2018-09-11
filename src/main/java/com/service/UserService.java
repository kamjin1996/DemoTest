package com.service;

import com.dao.User;

import java.util.List;

/**
 * @Auther: KAM1996
 * @Date: 下午 7:44 2018-09-11
 * @Description: 用户服务
 * @Version: 1.0
 */
public interface UserService {
    User add(User user);
    List<User> select();
    boolean del(Integer id);
}
