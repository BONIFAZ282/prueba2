package com.virtual.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VirtualServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualServiceApplication.class, args);
	}

}
