package com.owenblog.db.dao;

import com.owenblog.controller.blog.form.searchArticlesForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface ArticleDao {
    public ArrayList<HashMap> SearchArticles(HashMap searchFromh);
    public Integer SearchCount();
}
