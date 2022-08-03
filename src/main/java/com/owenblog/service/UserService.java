package com.owenblog.service;

import com.owenblog.controller.form.UserLoginForm;

import java.util.HashMap;

public interface UserService {
    public HashMap login(UserLoginForm userLoginFrom);
}
