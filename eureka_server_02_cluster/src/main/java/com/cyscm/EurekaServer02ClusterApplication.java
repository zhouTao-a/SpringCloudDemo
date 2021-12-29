package com.cyscm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoutao
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer02ClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer02ClusterApplication.class, args);
    }

}
