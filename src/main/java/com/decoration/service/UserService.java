package com.decoration.service;

import com.decoration.domain.User;
import com.decoration.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LiMeiyuan on 2017/2/4.
 * 用户服务类
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(String id) {
        return userMapper.getUser2(id);
    }
}
