package com.owenblog.controller.blog;

import com.owenblog.controller.blog.form.searchArticlesForm;
import com.owenblog.service.ArticleService;
import com.owenblog.util.JsonResult;
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

    @PostMapping("articles")
    public JsonResult SearchArticles(@RequestBody searchArticlesForm search){
        Integer start=(search.getPage()-1)*search.getPageSize();
        HashMap param= JSONUtil.parse(search).toBean(HashMap.class);
        param.put("start",start);
        PageUtils page =articleService.SearchArticles(param);
        return JsonResult.ok(page);
//        return JsonResult.ok();
    }

}
