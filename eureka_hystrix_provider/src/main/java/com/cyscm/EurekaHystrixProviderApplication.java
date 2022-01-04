package com.cyscm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhoutao
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaHystrixProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixProviderApplication.class, args);
    }

}
