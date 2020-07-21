package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	@GetMapping("/devops")
	public String sayDevops() {
		return "Welcome to Devops";
	}
	@GetMapping("/content")
	public String sayContent() {
		return "Devops material";
	}
}