package com.code.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

public class CircuitController {
	
    @CircuitBreaker(name = "backendServiceCircuitBreaker", fallbackMethod = "fallback")
    public String fetchDataFromRemoteService() {
        return "Message delivered successfully...";
    }

    // Fallback method for circuit breaker
    public String fallback(Throwable throwable) {
        return "Fallback response: Unable to connect to the remote service.";
    }
	
}
