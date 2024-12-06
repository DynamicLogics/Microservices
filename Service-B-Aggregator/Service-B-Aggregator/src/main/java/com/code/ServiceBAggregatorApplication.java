package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.code.*"})
public class ServiceBAggregatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBAggregatorApplication.class, args);
	}

}
