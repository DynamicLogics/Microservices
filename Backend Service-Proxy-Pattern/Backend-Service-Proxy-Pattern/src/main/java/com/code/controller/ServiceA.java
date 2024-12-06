package com.code.controller;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/")
public class ServiceA {
	
	
	@GetMapping(path = "/service-a",
				produces=MediaType.APPLICATION_JSON_VALUE)	
	public HashMap<String, String> getServiceAResponse(){
		HashMap<String, String> getPersonResponse = new HashMap<String,String>();
		getPersonResponse.put("id-1234", "John-Doe, CA, USA");
		return getPersonResponse;
	}
	
}
