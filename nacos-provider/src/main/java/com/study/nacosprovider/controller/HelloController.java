package com.study.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/*
 * @author cp
 * @create 2019-12-30 12:01
 */
@RestController
@RefreshScope//动态加载配置
public class HelloController {
    @Value("${myName}")
    private String myName;
    @Value("${jdbcUrl}")
    private String jdbcUrl;
    @Value("${redisUrl}")
    private String redisUrl;
    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        System.out.println(request.getRequestURL().toString());
        System.out.println(request.getRequestURI());
        return "hello"+myName+","+jdbcUrl+","+redisUrl;
    }
}
