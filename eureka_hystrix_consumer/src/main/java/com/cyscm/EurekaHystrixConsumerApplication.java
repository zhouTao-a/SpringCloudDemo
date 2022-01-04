package com.cyscm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhoutao
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaHystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixConsumerApplication.class, args);
    }

}
