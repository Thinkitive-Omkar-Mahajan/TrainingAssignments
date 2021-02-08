package com.thinkitive.model;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "option_table")
public class Option {
	private Long optionId;
	private Long questionId;
	private int optionNumber;
	private int optionTitle;
	
	public Option() {
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public int getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(int optionNumber) {
		this.optionNumber = optionNumber;
	}

	public int getOptionTitle() {
		return optionTitle;
	}

	public void setOptionTitle(int optionTitle) {
		this.optionTitle = optionTitle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((optionId == null) ? 0 : optionId.hashCode());
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
		Option other = (Option) obj;
		if (optionId == null) {
			if (other.optionId != null)
				return false;
		} else if (!optionId.equals(other.optionId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Option [optionId=" + optionId + ", questionId=" + questionId + ", optionNumber=" + optionNumber
				+ ", optionTitle=" + optionTitle + "]";
	}
	
}
