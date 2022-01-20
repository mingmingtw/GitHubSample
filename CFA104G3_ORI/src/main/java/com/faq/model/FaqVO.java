package com.faq.model;

import java.io.Serializable;

public class FaqVO implements Serializable {
	private Integer id;
	private String question;
	private String answer;

	public FaqVO() {
	}

	public FaqVO(Integer id, String question, String answer) {
		this.id = id;
		this.question = question;
		this.answer = answer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "FaqVO [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
}