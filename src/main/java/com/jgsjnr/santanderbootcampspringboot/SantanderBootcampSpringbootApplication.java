package com.jgsjnr.santanderbootcampspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SantanderBootcampSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderBootcampSpringbootApplication.class, args);
	}

}
