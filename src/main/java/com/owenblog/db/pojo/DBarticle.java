package com.owenblog.db.pojo;

import javax.xml.crypto.Data;

@lombok.Data
public class DBarticle {
    private Integer id;
    private String title;
    private String comtent;
    private String auth;
    private String ishot;
    private String surface_url;
    private Data create_time;
    private Integer readtimes;

}
