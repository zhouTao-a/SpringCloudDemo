package com.cyscm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoutao
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaHystrixServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixServerApplication.class, args);
    }

}
