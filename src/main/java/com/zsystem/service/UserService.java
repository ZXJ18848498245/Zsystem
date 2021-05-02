package com.zsystem.service;

import com.zsystem.entity.User;

public interface UserService {

    //用户登录检测
    User checkUser(String username , String password);
}
