package com.universidad.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UniversidadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversidadServiceApplication.class, args);
	}

}
