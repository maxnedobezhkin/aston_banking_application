package com.aston_banking_application.service;

import java.util.Optional;

import com.aston_banking_application.User;

public interface UserService {
	
	public Optional<User> findUserByLogin(String login);
	public void saveUser(User user);

}
