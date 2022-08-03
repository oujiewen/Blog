package com.owenblog.util;

import java.util.HashMap;

public class R extends HashMap<String ,Object> {
    private  Integer SUCCESS=200;

    private Integer ERROR=500;

    private Integer PERMISSION=403;

    private Integer LOGOUT=400;

    public R(){
        put("code",SUCCESS);
        put("msg","SUCCESS");
    }

    public R put(String key, Object value){
        super.put(key , value);
        return this;
    }

    public static R ok(){return new R();};

    public  static R nologin(){
        R res=new R();
        res.put("code", res.LOGOUT);
        res.put("msg" , "用户未登陆");
        return res;
    }

    public static R ok(Object object){
        R res=new R();
        res.put("data" , object);
        return res;
    }

    public static R eroor(String msg){
        R res=new R();
        res.put("code", res.ERROR);
        res.put("msg",msg);
        return res;
    }
}
