package com.roger.springbootmall.service.Impl;

import com.roger.springbootmall.dao.UserDao;
import com.roger.springbootmall.dto.UserRegisterRequest;
import com.roger.springbootmall.model.User;
import com.roger.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
