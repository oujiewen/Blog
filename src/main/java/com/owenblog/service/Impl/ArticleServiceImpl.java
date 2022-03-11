package com.owenblog.service.Impl;

import com.owenblog.db.dao.ArticleDao;
import com.owenblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public ArrayList<HashMap> getAllArticles() {
        ArrayList<HashMap> arrayList= articleDao.articlelist();
        return arrayList;
    }
}
