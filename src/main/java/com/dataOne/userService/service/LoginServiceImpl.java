package com.dataOne.userService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataOne.userService.entity.User;
import com.dataOne.userService.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	UserRepository userRepo;

	public boolean doLogin(String username, String password){
		
		User user = userRepo.findUserByUsername(username);

		
		if(user != null && user.getUsername().equals(username) && user.getPassword().equals(password))
			return true;
		return false;
	}
}
