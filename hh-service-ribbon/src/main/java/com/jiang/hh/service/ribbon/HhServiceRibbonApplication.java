package com.jiang.hh.service.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class HhServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HhServiceRibbonApplication.class, args);
	}

    /**
     * 并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
