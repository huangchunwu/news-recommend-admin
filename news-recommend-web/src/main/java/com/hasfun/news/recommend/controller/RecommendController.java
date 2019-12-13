package com.hasfun.news.recommend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecommendController {

    @RequestMapping("/news/recommend/query/list")
    @ResponseBody
    public String queryList(){
        return "yes";
    }
}
