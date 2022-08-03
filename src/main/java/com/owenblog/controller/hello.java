package com.owenblog.controller;

import cn.dev33.satoken.stp.SaLoginConfig;
import cn.dev33.satoken.stp.StpUtil;
import com.owenblog.service.HelloService;
import com.owenblog.util.R;
import com.xfvape.uid.UidGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;

@Slf4j
@RestController
public class hello {

    @Autowired
    HelloService helloService;

    @Autowired
    private UidGenerator uidGenerator;





    @GetMapping("hello2")
    public R hello() {
        HashMap h=helloService.searchbyid(2);
        return R.ok(h);
    }

    @GetMapping("hello3")
    public R hello3() {
        ArrayList<HashMap> h=helloService.searchall();
        return R.ok(h);
    }

    @GetMapping("login")
    public R login(){
        StpUtil.checkLogin();
        StpUtil.login(uidGenerator.getUID(), SaLoginConfig
                .setExtra("name", "zhangsan")
                .setExtra("age", 18)
                .setExtra("role", "超级管理员"));
//        HashMap hashMap=new HashMap();
//        hashMap.put("token",StpUtil.getTokenValue());
//        hashMap.put("token_name",StpUtil.getTokenName());
//        hashMap.put("user_id",StpUtil.getLoginId());
//        hashMap.put("name",StpUtil.getExtra("name"));
//        hashMap.put("age",StpUtil.getExtra("age"));
//        hashMap.put("role",StpUtil.getExtra("role"));
        return R.ok();
    }

    @GetMapping("islogin")
    public R islogin(){

        HashMap hashMap=new HashMap();
        hashMap.put("islogin",StpUtil.isLogin());
        return R.ok(hashMap);
    }


}
