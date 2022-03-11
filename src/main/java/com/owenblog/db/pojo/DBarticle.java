package com.owenblog.db.pojo;
import lombok.Data;

@Data
public class DBarticle {
    private Integer id;
    private String title;
    private String comtent;
    private String auth;
    private String ishot;
    private String surface_url;
    private String create_time;
    private Integer readtimes;
    private Integer type;
}
