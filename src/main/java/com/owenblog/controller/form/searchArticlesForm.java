package com.owenblog.controller.form;

import lombok.Data;

@Data
public class searchArticlesForm {
    private Integer pageSize;
    private Integer page;
    private String title;
    private  String content;
    private String auth;
    private String ishot;
    private String type;
}
