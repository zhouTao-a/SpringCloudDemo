package com.cyscm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoutao
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer01ClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer01ClusterApplication.class, args);
    }

}
