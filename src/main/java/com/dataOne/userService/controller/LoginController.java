package com.dataOne.userService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dataOne.userService.entity.User;
import com.dataOne.userService.model.Credentials;
import com.dataOne.userService.model.UserRegistrationForm;
import com.dataOne.userService.service.LoginService;
import com.dataOne.userService.service.SignUpService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(
			value = "/login",
			method = RequestMethod.POST)
	public User index(
			@RequestBody Credentials credentials) {
		
		
		User user = loginService.doLogin(credentials.getEmail(), credentials.getPassword());
		
		return user;
	}
	
	
	@Autowired
	SignUpService signUpService;
	
	@RequestMapping(
			value = "/signUp",
			method = RequestMethod.POST)
	public String signUp(
			@RequestBody UserRegistrationForm userRegsitrationForm) {
		
		if(!userRegsitrationForm.getEmail().isEmpty() && !userRegsitrationForm.getPassword().isEmpty() &&
				userRegsitrationForm.getPassword().equals(userRegsitrationForm.getRePassword()))
		{
			String signUp = signUpService.doSignUp(userRegsitrationForm.getFirstName(), userRegsitrationForm.getLastName(),
				userRegsitrationForm.getEmail(), userRegsitrationForm.getPassword());
				return signUp;
		}
		else return "Invalid Input";
	}
}
