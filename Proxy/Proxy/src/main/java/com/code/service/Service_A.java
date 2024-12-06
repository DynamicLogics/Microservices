package com.code.service;

import java.util.HashMap;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="service-a-resp", url = "http://localhost:8081")
public interface Service_A {
	@GetMapping("/service-a")
	public HashMap<String, String> getServiceAResponse();
}
