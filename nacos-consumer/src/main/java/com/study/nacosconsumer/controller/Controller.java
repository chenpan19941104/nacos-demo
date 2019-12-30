package com.study.nacosconsumer.controller;

import com.study.nacosconsumer.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cp
 * @create 2019-12-30 13:08
 */
@RestController
public class Controller {
    @Autowired
    private ProviderFeign providerFeign;
    @GetMapping("/hi")
    public String hi(){
        return "hi"+providerFeign.hello();
    }
}
