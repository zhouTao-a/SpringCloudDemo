package com.cyscm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoutao
 */
@SpringBootApplication
public class EurekaServiceConsumerClusterApplication {

    @Bean
//    @LoadBalanced //负载均衡注解
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceConsumerClusterApplication.class, args);
    }

}
