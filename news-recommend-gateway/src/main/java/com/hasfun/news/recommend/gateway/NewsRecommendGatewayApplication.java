package com.hasfun.news.recommend.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class NewsRecommendGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsRecommendGatewayApplication.class, args);
    }

}
