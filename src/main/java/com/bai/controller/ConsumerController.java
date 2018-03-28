package com.bai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bai.service.HelloService;

@RestController
public class ConsumerController {
	
	@Autowired
	public HelloService service;
	
	@GetMapping("consumer")
	public String helloConsumer() {
		
		return service.hello();
	}
}

