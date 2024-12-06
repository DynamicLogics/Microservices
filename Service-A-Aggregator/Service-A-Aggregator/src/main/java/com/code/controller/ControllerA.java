package com.code.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin
@RestController
@RequestMapping("/service-a")
public class ControllerA {
	
	@GetMapping(path = "/getConsumerAData",
			    produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> getDataA() {
		    Map<String, String> response = new HashMap<>();
	        response.put("product", "Laptop");
	        response.put("price", "1000 USD");
	        return response;
	}
	
}
