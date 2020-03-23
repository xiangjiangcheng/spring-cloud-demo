package com.jiang.hh.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HhRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HhRegisterApplication.class, args);
	}

}
