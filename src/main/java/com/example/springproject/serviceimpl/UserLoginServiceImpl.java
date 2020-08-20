package com.example.springproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.User;
import com.example.springproject.repo.UserRepo;
import com.example.springproject.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	
	@Autowired
	UserRepo userRepo;

	public boolean validateUser(String username, String password) {
		System.out.println("Entering - LoginServiceImpl.validateUser(String, String) - username : "+username+" | password : "+password);
		boolean validUser = false;
		User user = userRepo.validateUser(username, password);
		if(user != null){
			validUser = true;
		}
		return validUser;
	}

	public User save(User user) {
		return userRepo.save(user);
	}

	public List<User> getAllUserDetails() {
		return userRepo.findAll();
	}

	public int deleteUserDetailsById(Long id) {
		return userRepo.deleteUserDetailsById(id);
	}
	

}
