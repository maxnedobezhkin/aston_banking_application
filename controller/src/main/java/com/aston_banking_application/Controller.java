package com.aston_banking_application;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aston_banking_application.bpp.BppMessage;
import com.aston_banking_application.serviceimpl.UserServiceImp;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@BppMessage
public class Controller {
	
	UserServiceImp userService;
	
	@GetMapping("/find")
	public Optional<User> findUser(@RequestParam(name = "login") String login) {
		return userService.findUserByLogin(login);
	}
	
	@PostMapping("/save")
	public void addUser(@RequestBody User user) {
		userService.saveUser(user);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Post construct method in controller");
	}

}
