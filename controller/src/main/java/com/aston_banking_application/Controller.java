package com.aston_banking_application;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aston_banking_application.service.UserService;

@RestController
public class Controller {
	
	UserService userService;
	
	@GetMapping("/find")
	public Optional<User> findUser(@RequestParam(name = "login") String login) {
		return userService.findUserByLogin(login);
	}

}
