package com.aston_banking_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ControllerApplication {
	
	@GetMapping("/name")
	public void printMessage() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		SpringApplication.run(ControllerApplication.class, args);
	}

}
