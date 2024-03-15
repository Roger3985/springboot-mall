package com.roger.springbootmall.dao;

import com.roger.springbootmall.dto.UserRegisterRequest;
import com.roger.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
