package com.owenblog.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.owenblog.service.ArticleService;
import com.owenblog.util.R;
import cn.hutool.json.JSONUtil;
import com.owenblog.util.PageUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@Slf4j
@RequestMapping("/blog")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

//    @PostMapping("articles")
//    public R SearchArticles(@RequestBody searchArticlesForm search){
//        Integer start=(search.getPage()-1)*search.getPageSize();
//        HashMap param= JSONUtil.parse(search).toBean(HashMap.class);
//        param.put("start",start);
//        PageUtils page =articleService.SearchArticles(param);
//        return R.ok(page);
////        return JsonResult.ok();
//    }

    @SaCheckPermission("user:add")
    @GetMapping("articles/hotarticles")
    public R SearchHotArticles(){
        ArrayList<HashMap> hotArticles= articleService.SearchHotArticles();
        return R.ok(hotArticles);
    }

    @GetMapping("article")
    public R SearchArticlesById(String id){
        log.info(id.toString());
        return R.ok();
    }
}
