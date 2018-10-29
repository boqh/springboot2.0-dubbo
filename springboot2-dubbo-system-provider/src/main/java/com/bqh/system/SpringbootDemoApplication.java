package com.bqh.system;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDubboConfiguration
@EnableScheduling
@MapperScan("com.bqh.system.mapper")
public class SpringbootDemoApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }
}


