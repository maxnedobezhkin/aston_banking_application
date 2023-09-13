package com.aston_banking_application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/name")
	public void printMessage() {
		System.out.println("Hello");
	}

}
