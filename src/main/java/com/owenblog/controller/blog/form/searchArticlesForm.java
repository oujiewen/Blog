package com.owenblog.controller.blog.form;

import lombok.Data;
import lombok.NonNull;

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
