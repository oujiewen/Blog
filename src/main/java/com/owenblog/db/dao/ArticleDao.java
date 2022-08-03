package com.owenblog.db.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface ArticleDao {
    public ArrayList<HashMap> SearchArticles(HashMap searchFromh);

    public Integer SearchCount();

    public ArrayList<HashMap> SearchHotArticles();

    public HashMap SearchArticleById(Integer id);
}
