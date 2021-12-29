package com.cyscm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhoutao
 */
@SpringBootApplication
@EnableFeignClients
public class EurekaServiceConsumerFeignClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceConsumerFeignClusterApplication.class, args);
    }
}
