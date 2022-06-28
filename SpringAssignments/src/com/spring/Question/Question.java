package com.spring.Question;

import java.util.List;

public class Question {
	  private int questionId;
	    private String question;
	    private  List<String> answers;

	    public Question(int questionId, String question, List<String> answer) {
	        this.questionId = questionId;
	        this.question = question;
	        this.answers = answer;
	    }

	    public Question() {
	    
	    }

		public int getQuestionId() {
			return questionId;
		}

		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public List<String> getAnswers() {
			return answers;
		}

		public void setAnswers(List<String> answers) {
			this.answers = answers;
		}

	   
}
