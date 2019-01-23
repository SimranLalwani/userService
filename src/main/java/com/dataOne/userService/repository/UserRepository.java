package com.dataOne.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dataOne.userService.entity.User;

public interface UserRepository extends  JpaRepository<User, Long> {
	public User findUserByUsername(String username);
}
