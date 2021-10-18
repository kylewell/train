package com.kyle.train.service.impl;

import com.kyle.train.dao.UserDao;
import com.kyle.train.model.User;
import com.kyle.train.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User queryById(int id) {
        return userDao.queryById(id);
    }
}
