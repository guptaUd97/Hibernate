//package com.mapping;
//
//	import java.util.List;
//
//import javax.persistence.Column;
//	import javax.persistence.Id;
//	import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
//	public class Question2 {
//		
//		@Id
//		@Column(name="question_id")
//		private int questionId;
//		private String question;
//		
//		@OneToMany(mappedBy="question2")
//		private List<Answer2> answers;
//
//
//		public Question2(int questionId, String question, List<Answer2> answers) {
//			super();
//			this.questionId = questionId;
//			this.question = question;
//			this.answers = answers;
//		}
//
//
//		public Question2() {
//			super();
//			// TODO Auto-generated constructor stub
//		}
//
//
//		public int getQuestionId() {
//			return questionId;
//		}
//
//
//		public void setQuestionId(int questionId) {
//			this.questionId = questionId;
//		}
//
//
//		public String getQuestion() {
//			return question;
//		}
//
//
//		public void setQuestion(String question) {
//			this.question = question;
//		}
//
//
//		public List<Answer2> getAnswers() {
//			return answers;
//		}
//
//
//		public void setAnswers(List<Answer2> answers) {
//			this.answers = answers;
//		}
//		
//		
//
//
//		
//		
//		
//
//	}
//
//
