package com.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVER001")
public interface TestFeignApi {
    @GetMapping("findAll")
    public String findAll(String msg);
}
