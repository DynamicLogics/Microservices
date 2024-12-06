package com.code.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.service.Service_A;

@CrossOrigin
@RestController
@RequestMapping("/")
public class ProxyController {
	
	@Autowired
	Service_A servA;
	
	@GetMapping(path = "/service-a",
			    produces=MediaType.APPLICATION_JSON_VALUE)	
	public HashMap<String, String> getProxyResponse(){
		HashMap<String, String> getPersonResponse = servA.getServiceAResponse();
		getPersonResponse.put("Message", "Proxy response generated successfully...");
		return getPersonResponse;
	}
	
}
