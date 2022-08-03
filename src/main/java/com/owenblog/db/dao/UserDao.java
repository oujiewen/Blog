package com.owenblog.db.dao;

import com.owenblog.controller.form.UserLoginForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface UserDao {
    public HashMap login(UserLoginForm userLoginFrom);
}
