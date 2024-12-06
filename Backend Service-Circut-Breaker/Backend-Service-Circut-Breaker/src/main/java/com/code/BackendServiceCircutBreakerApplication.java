package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.code.*"})
//@EnableCircuitBreaker 

public class BackendServiceCircutBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendServiceCircutBreakerApplication.class, args);
	}

}
