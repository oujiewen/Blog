package com.owenblog.service.Impl;

import com.owenblog.db.dao.HelloDao;
import com.owenblog.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloDao helloDao;

    @Override
    public HashMap searchbyid(Integer id){
        HashMap hp=helloDao.searchbyid(id);
        return hp;
    }

    @Override
    public ArrayList<HashMap> searchall(){
        ArrayList<HashMap> arrary=helloDao.searchall();
        return arrary;
    }
}
