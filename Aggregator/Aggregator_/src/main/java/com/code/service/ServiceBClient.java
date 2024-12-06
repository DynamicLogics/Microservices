package com.code.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="service-b",url="http://localhost:8082/service-b")
public interface ServiceBClient {
	@GetMapping("/getConsumerBData")
	public Map<String, String> getDataB();
}
