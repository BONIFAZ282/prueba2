package com.presencial.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PresencialServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PresencialServiceApplication.class, args);
	}

}
