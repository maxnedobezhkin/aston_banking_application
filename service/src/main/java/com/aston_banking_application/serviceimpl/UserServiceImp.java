package com.aston_banking_application.serviceimpl;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aston_banking_application.User;
import com.aston_banking_application.UserRepository;
import com.aston_banking_application.bpp.BppMessage;
import com.aston_banking_application.service.UserService;

import jakarta.annotation.PostConstruct;
import lombok.Data;

@Service
@Data
@BppMessage
@Transactional
public class UserServiceImp implements UserService {
	
	private final UserRepository userRepository;

	@Override
	public Optional<User> findUserByLogin(String login) {
		return userRepository.findByLogin(login);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Post construct method in service imp");
	}


}
