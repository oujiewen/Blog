package com.owenblog.controller.blog;

import com.owenblog.service.ArticleService;
import com.owenblog.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/blog")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("articles")
    public JsonResult getAllArticles(){
        ArrayList<HashMap> articlelist=articleService.getAllArticles();
        return JsonResult.ok(articlelist);
    }

}
