package com.hasfun.news.recommend.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hasfun.news.recommend.api.service.IRecommendConfigDubboService;

@Service(version="1.0.0")
public class RecommendConfigDubboService implements IRecommendConfigDubboService {

    @Override
    public Object queryRecommendCongfigList() {
        return null;
    }
}
