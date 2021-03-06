package com.decoration.domain;

import java.io.Serializable;

/**
 * Created by LiMeiyuan on 2017/2/4.
 * 用户实体类
 */
public class User implements Serializable {
    private String id;
    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
