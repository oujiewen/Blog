package com.owenblog.util;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

public class JsonResult extends HashMap<String ,Object> {
    private  Integer SUCCESS=200;

    private Integer ERROR=500;

    private Integer PERMISSION=403;

    private Integer LOGOUT=400;

    public JsonResult(){
        put("code",SUCCESS);
        put("msg","SUCCESS");
    }

    public JsonResult put(String key, Object value){
        super.put(key , value);
        return this;
    }

    public static JsonResult ok(){return new JsonResult();};

    public  static JsonResult nologin(){
        JsonResult res=new JsonResult();
        res.put("code", res.LOGOUT);
        res.put("msg" , "用户未登陆");
        return res;
    }

    public static JsonResult ok(Object object){
        JsonResult res=new JsonResult();
        res.put("data" , object);
        return res;
    }

    public static  JsonResult eroor(String msg){
        JsonResult res=new JsonResult();
        res.put("code", res.ERROR);
        res.put("msg",msg);
        return res;
    }
}
