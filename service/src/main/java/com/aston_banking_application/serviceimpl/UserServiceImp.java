package com.aston_banking_application.serviceimpl;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aston_banking_application.User;
import com.aston_banking_application.UserRepository;
import com.aston_banking_application.service.UserService;

import lombok.Data;

@Service
@Data
public class UserServiceImp implements UserService {
	
	private final UserRepository userRepository;

	@Override
	public Optional<User> findUserByLogin(String login) {
		return userRepository.findByLogin(login);
	}


}
