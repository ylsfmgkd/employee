package com.mapper;

import com.pojo.User;

public interface UserMapper
{
    User queryUsernameAndPassword(User user);//登录
    int registerUser(User user);     //注册
}
