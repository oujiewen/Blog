package com.owenblog;

import com.owenblog.db.dao.ArticleDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class BlogApplicationTests {

    @Autowired
    private ArticleDao articleDao;

    @Test
    void mytes(){
        log.info(articleDao.SearchArticleById(2).toString());
    }


}
