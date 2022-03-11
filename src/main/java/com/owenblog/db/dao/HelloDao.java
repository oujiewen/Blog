package com.owenblog.db.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface HelloDao {
//    @Select("select * from SELECT * FROM blog2_article")
//    public ArrayList<hello> searchall();

//    @Select("SELECT * FROM blog2_article where id = #{id};")
    public HashMap searchbyid(Integer id);

    public ArrayList<HashMap> searchall();
}
