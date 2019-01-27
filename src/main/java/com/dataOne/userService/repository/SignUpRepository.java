package com.dataOne.userService.repository;

import org.springframework.data.repository.CrudRepository;

import com.dataOne.userService.entity.User;

public interface SignUpRepository extends  CrudRepository<User, Long>{
	public User save(User user);
}
