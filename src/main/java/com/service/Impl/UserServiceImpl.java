package com.service.Impl;


import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.queryUsernameAndPassword(user);
    }

    @Override
    public boolean register(User user) {
        int row= userMapper.registerUser(user);
        if (row>0)
        {
            return true;
        }
        return false;
    }
}