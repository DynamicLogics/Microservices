package com.code.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="service-a",url="http://localhost:8081/service-a")
public interface ServiceAClient {
	@GetMapping("/getConsumerAData")
	public Map<String, String> getDataA();
}
