package com.bai.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-prodiver")
public interface HelloService {
	
	@RequestMapping("/hello")
	String hello();

}
