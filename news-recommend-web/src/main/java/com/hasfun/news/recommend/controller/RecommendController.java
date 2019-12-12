package com.hasfun.news.recommend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/news/recommend")
public class RecommendController {

    @RequestMapping("/query/list")
    public String queryList(){
        return "yes";
    }
}
