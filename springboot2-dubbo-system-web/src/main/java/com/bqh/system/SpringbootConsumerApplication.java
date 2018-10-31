package com.bqh.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;


@ComponentScan("com.bqh")
@ImportResource({"classpath:dubbo.xml"})
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableAspectJAutoProxy
//@EnableDubboConfiguration
public class SpringbootConsumerApplication extends SpringBootServletInitializer {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootConsumerApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumerApplication.class, args);
        System.out.println("============= Spring boot webApplication starter ============");
    }


}
