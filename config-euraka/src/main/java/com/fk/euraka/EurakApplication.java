package com.fk.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title:
 * @author: fan.kun
 * @date: 2020/5/29
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurakApplication.class,args);
    }
}
