package com.owenblog.controller;

import cn.dev33.satoken.stp.SaLoginConfig;
import cn.dev33.satoken.stp.StpUtil;
import com.owenblog.Exception.ErrorMsg;
import com.owenblog.controller.form.UserLoginForm;
import com.owenblog.service.UserService;
import com.owenblog.util.R;
import com.xfvape.uid.UidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.HashMap;

@RestController
@RequestMapping("/blog/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    UidGenerator uidGenerator;

    @PostMapping("login")
    public R login(@Valid @RequestBody UserLoginForm userLoginForm){
        HashMap user_info=userService.login(userLoginForm);
        if(user_info==null){
            return R.eroor(ErrorMsg.login_u_p_error);
        }
        StpUtil.login(user_info.get("id"), SaLoginConfig
                .setExtra("username", user_info.get("username"))
                .setExtra("status", user_info.get("status")));
        user_info.put("token",StpUtil.getTokenValue());
        user_info.put("tokenName",StpUtil.getTokenName());
        return R.ok(user_info);
    }

}
