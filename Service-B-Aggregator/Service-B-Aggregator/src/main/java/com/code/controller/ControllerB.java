package com.code.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/service-b")
public class ControllerB {
	
	@GetMapping(path = "/getConsumerBData",
			    produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> getDataB() {
        Map<String, String> response = new HashMap<>();
        response.put("user", "John Doe");
        response.put("email", "john.doe@example.com");
        return response;
	}
	
}
