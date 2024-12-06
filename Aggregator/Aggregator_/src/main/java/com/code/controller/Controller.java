package com.code.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.service.ServiceAClient;
import com.code.service.ServiceBClient;

@CrossOrigin
@RestController
@RequestMapping("/aggregator")
public class Controller {
	
	@Autowired
	ServiceAClient serviceAClient;
	
	@Autowired
	ServiceBClient serviceBClient;
	
	@GetMapping(path = "/getData",
			    produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> getData() {
        Map<String, String> serviceAData = serviceAClient.getDataA();
        Map<String, String> serviceBData = serviceBClient.getDataB();

        Map<String, Object> aggregatedResponse = new HashMap<>();
        aggregatedResponse.put("productDetails", serviceAData);
        aggregatedResponse.put("userDetails", serviceBData);

        return aggregatedResponse;
	}
}
