package com.dataOne.userService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dataOne.userService.model.Credentials;
import com.dataOne.userService.service.LoginService;
import com.dataOne.userService.vo.Status;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(
			value = "/login",
			method = RequestMethod.POST)
	public Status index(
			@RequestBody Credentials credentials) {
		
		Status status = new Status();
		if(loginService.doLogin(credentials.getUsername(), credentials.getPassword())){
			status.setMessage("Login Successful");
			status.setStatus("200");
		}
		else
		{
			status.setMessage("Invalid Credentials");
			status.setStatus("401");
		}
		
		return status;
	}
}
