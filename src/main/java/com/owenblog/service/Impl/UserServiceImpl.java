package com.owenblog.service.Impl;

import com.owenblog.controller.form.UserLoginForm;
import com.owenblog.db.dao.UserDao;
import com.owenblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;

    @Override
    public HashMap login(UserLoginForm userLoginFrom) {
        HashMap user_info=userDao.login(userLoginFrom);
        return user_info;
    }
}
