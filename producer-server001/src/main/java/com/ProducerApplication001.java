package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName : ProducerApplicaiton
 * @Description : 生产者启动类
 * @Author : zhangpenghai
 * @Date: 2020-08-05 16:32
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(value = "com.controller")
@EnableFeignClients
public class ProducerApplication001 {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication001.class,args);
    }
    @Bean

    public String configs(){
        return "hello";
    }
}
