package com.example.springproject.service;

import java.util.List;

import com.example.springproject.model.User;

public interface UserLoginService {

	public boolean validateUser(String username, String password);

	public User save(User user);

	public List<User> getAllUserDetails();

	public int deleteUserDetailsById(Long id);
}
