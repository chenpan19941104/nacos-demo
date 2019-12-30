package com.study.nacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author cp
 * @create 2019-12-30 13:13
 */
@FeignClient("service-provider")
public interface ProviderFeign {
    @GetMapping("/hello")
    public String hello();
}
