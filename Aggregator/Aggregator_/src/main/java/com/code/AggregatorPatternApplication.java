package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.code.*"})
@EnableFeignClients(basePackages = "com.code.*")
public class AggregatorPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(AggregatorPatternApplication.class, args);
	}

}
