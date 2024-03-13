package com.registration.form.service;

import org.springframework.stereotype.Service;

import com.registration.form.entity.User;

@Service
public interface UserService {
	public void registerUser(User user);

}
