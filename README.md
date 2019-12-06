# 新闻推荐采集平台

- 项目采用pom父子结构
```
-- news-recommend-admin      ------父级pom
  --- news-recommend-api     ------dubbo api定义，以jar包形式提供
  --- news-recommend-provider -----dubbo服务，用jar包形式单独部署
  --- news-recommend-web      -----web服务，页面使用springBoot的模板引擎thymeleaf做新闻采集中台
```

- 项目部署方式

该项目，使用Java wrapper service 在Linux以守护线程的形式部署news-recommend-provider.jar,news-recommend-web.jar，非常好用。

- UI

我采用的是基于bootstrap的adminLTE
