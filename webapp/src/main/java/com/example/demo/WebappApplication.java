package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Controller
public class WebappApplication {
	
	@ResponseBody
	@RequestMapping("/")
	String Entry(){
	return "My Spring Boot App";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}
}
