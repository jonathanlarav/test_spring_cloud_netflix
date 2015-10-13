package com.test.core.main.client.one.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jonathanlara on 10/13/15.
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.test.core.main.client.one"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}