package com.dataOne.userService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataOne.userService.entity.User;
import com.dataOne.userService.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	UserRepository userRepo;

	public User doLogin(String email, String password){
		
		User user = userRepo.findUserByEmail(email);

		
		if(user != null && user.getPassword().equals(password))
			return user;
		else
			return null;
	}
}
