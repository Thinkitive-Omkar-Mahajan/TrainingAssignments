package com.thinkitive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkitive.dao.UserExamQuestionAnswerRepo;
import com.thinkitive.model.userExamQuestionAnswer;

@Service
public class UserExamQuestionAnswerService {
	
	@Autowired
	private UserExamQuestionAnswerRepo repo;
	
	public void addQuestionWithAnswer(userExamQuestionAnswer QA) {
		repo.save(QA);
	}
	
	public void CalculateScore() {
	}
}
