package com.owenblog.controller;

import com.owenblog.service.HelloService;
import com.owenblog.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;


@RestController
public class hello {

    @Autowired
    HelloService helloService;


    @GetMapping("hello2")
    public JsonResult hello() {
        HashMap h=helloService.searchbyid(2);
        return JsonResult.ok(h);
    }

    @GetMapping("hello3")
    public JsonResult hello3() {
        ArrayList<HashMap> h=helloService.searchall();
        return JsonResult.ok(h);
    }


}
