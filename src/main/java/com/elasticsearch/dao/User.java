package com.elasticsearch.dao;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Auther: KAM1996
 * @Date: 下午 7:40 2018-09-11
 * @Description: user
 * @Version: 1.0
 */
@Document(indexName = "myusers",type = "user")
public class User {
    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
