package com.registration.form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.form.entity.User;
import com.registration.form.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo repo;
	@Override
	public void registerUser(User user) {
		repo.save(user);
	
	}
	

}
