package com.thinkitive;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.dao.UserRepo;
import com.thinkitive.model.User;

@RestController
public class ExamController {
	
	@Autowired
	private UserRepo repo;
	
	@GetMapping("/add")
	public User addStudent(@RequestBody User user) {
		repo.save(user);
		return user;
	}
}
