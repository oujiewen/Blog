package com.owenblog.service;


import java.util.ArrayList;
import java.util.HashMap;

public interface HelloService {
    public HashMap searchbyid(Integer id);

    public ArrayList<HashMap> searchall();
}
