package com.thinkitive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "question_table")
public class Question {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long questionId;
	private Long examId;
	private String questionTitle;
	private int questionAnswerOption;
	
	
	public Question() {
	}

	public Question(Long questionId, Long examId, String questionTitle, int questionAnswerOption) {
		super();
		this.questionId = questionId;
		this.examId = examId;
		this.questionTitle = questionTitle;
		this.questionAnswerOption = questionAnswerOption;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public int getQuestionAnswerOption() {
		return questionAnswerOption;
	}

	public void setQuestionAnswerOption(int questionAnswerOption) {
		this.questionAnswerOption = questionAnswerOption;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (questionId == null) {
			if (other.questionId != null)
				return false;
		} else if (!questionId.equals(other.questionId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", examId=" + examId + ", questionTitle=" + questionTitle
				+ ", questionAnswerOption=" + questionAnswerOption + "]";
	}
}
