package com.service;

import com.pojo.User;


public interface UserService {
    User login(User user);
    boolean register(User user);
}
