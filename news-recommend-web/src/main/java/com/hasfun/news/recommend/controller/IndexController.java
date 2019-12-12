package com.hasfun.news.recommend.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hasfun.news.recommend.api.service.IRecommendConfigDubboService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Reference(version = "1.0.0")
    private IRecommendConfigDubboService recommendConfigDubboService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("list", recommendConfigDubboService.queryRecommendCongfigList());
        return "index";
    }

}
