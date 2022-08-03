package com.owenblog.service.Impl;

import com.owenblog.Exception.MyException;
import com.owenblog.db.dao.ArticleDao;
import com.owenblog.service.ArticleService;
import com.owenblog.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public PageUtils SearchArticles(HashMap searchFromh) {
        ArrayList<HashMap> arrayList= articleDao.SearchArticles(searchFromh);
        Integer count=articleDao.SearchCount();
        PageUtils page=new PageUtils(arrayList,count,(Integer) searchFromh.get("page"),(Integer) searchFromh.get("pageSize"));
        return page;
    }

    @Override
    public ArrayList<HashMap> SearchHotArticles() {
        ArrayList<HashMap> hotArticles=articleDao.SearchHotArticles();
        return hotArticles;
    }

    @Override
    public HashMap SearchArticleById(Integer id) {
        return articleDao.SearchArticleById(id);
    }
}
