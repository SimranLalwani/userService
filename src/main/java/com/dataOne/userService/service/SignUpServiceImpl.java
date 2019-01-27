package com.dataOne.userService.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataOne.userService.entity.User;
import com.dataOne.userService.repository.SignUpRepository;
import com.dataOne.userService.repository.UserRepository;

@Service
public class SignUpServiceImpl implements SignUpService{
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	SignUpRepository signUpRepo;
	
	public String doSignUp(String fname, String lname, String email, String password) {
		User user = userRepo.findUserByEmail(email);
		
		if(user == null)
		{
			user = new User();
			user.setEmail(email);
			user.setFirstName(fname);
			user.setLastName(lname);
			user.setPassword(password);
			user.setJoiningTime(new Timestamp(System.currentTimeMillis()));
			User u1 = signUpRepo.save(user);
			
			User user1 = userRepo.findUserByEmail(email);
			
			if(user1.getEmail().equals(email))
				return "User Created";
			
			else 
				return "User not created, something went wrong!";
		}
		
		else 
			return "User already exists";
	}
}
