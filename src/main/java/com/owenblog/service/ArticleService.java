package com.owenblog.service;

import com.owenblog.util.PageUtils;

import java.util.ArrayList;
import java.util.HashMap;

public interface ArticleService {
    public PageUtils SearchArticles(HashMap searchFrom);

    public ArrayList<HashMap> SearchHotArticles();

    public HashMap SearchArticleById(Integer id);


}
