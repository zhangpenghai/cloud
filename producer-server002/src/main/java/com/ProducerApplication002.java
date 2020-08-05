package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : ProducerApplicaiton
 * @Description : 生产者启动类
 * @Author : zhangpenghai
 * @Date: 2020-08-05 16:32
 */
@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication002 {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication002.class,args);
    }
}
