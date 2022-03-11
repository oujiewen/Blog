package com.owenblog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class helloall{

    @GetMapping("helloall")
    public String hello() {
        log.info("hihihihihi");

        return "JsonResult.ok()";
    }


}
