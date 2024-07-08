//package com.mapping;
//
//import javax.persistence.Column;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//
//public class Answer2 {
//	
//	@Id
//	@Column(name="answer_id")
//	private int answerId;
//	private String answer;
//	
//	
//	//to generate bi-direction data save 
//	@ManyToOne
//	private Question question2;
//	
//	public Answer2(int answerId, String answer) {
//		super();
//		this.answerId = answerId;
//		this.answer = answer;
//	}
//	public Answer2() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public int getAnswerId() {
//		return answerId;
//	}
//	public void setAnswerId(int answerId) {
//		this.answerId = answerId;
//	}
//	public String getAnswer() {
//		return answer;
//	}
//	public void setAnswer(String answer) {
//		this.answer = answer;
//	}
//	public Question getQuestion() {
//		return question2;
//	}
//	public void setQuestion(Question question) {
//		this.question2 = question;
//	}
//	
//	
//	
//	
//	
//
//}
