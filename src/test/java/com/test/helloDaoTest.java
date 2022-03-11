package com.test;

import com.owenblog.db.dao.HelloDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class helloDaoTest {

    @Autowired
    private HelloDao hd;

    @Test
    void mytes(){
        hd.searchall();
    }


}
