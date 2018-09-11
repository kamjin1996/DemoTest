package com.service.impl;

import com.dao.User;
import com.elasticsearch.ElasticSearch;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: KAM1996
 * @Date: 下午 7:47 2018-09-11
 * @Description:
 * @Version: 1.0
 */
@Service
public class UserServieImpl implements UserService {

    @Autowired
    private ElasticSearch elasticSearch;

    @Override
    public User add(User user) {

        return elasticSearch.index(user);
    }
    @Override
    public List<User> select() {
        Iterator<User> iterator =  elasticSearch.findAll().iterator();
        List<User> users = new ArrayList<>();
        while (iterator.hasNext()){
            users.add(iterator.next());
        }
        return users;
    }
    @Override
    public boolean del(Integer id) {
        elasticSearch.deleteById(id);
        return true;
    }
}
