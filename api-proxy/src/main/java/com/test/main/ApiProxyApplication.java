package com.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by jonathanlara on 10/29/15.
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
@EnableCaching
@EnableZuulProxy
public class ApiProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiProxyApplication.class, args);
    }



}