package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;

/**
 * @ClassName : EurekaServerApplcation
 * @Description : Eureka 服务器启动类
 * @Author : zhangpenghai
 * @Date: 2020-08-05 16:23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
