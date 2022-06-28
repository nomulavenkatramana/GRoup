package com.spring.Question;

import java.util.Map;
import java.util.Set;

public class QuestionMap {
	private int questionId2;
    private String question2;
    private  Map<Integer,String> answers2;
	public QuestionMap(int questionId2, String question2, Map<Integer, String> answers2) {
		super();
		this.questionId2 = questionId2;
		this.question2 = question2;
		this.answers2 = answers2;
	}
	public QuestionMap() {
		super();
	}
	public int getQuestionId2() {
		return questionId2;
	}
	public void setQuestionId2(int questionId2) {
		this.questionId2 = questionId2;
	}
	public String getQuestion2() {
		return question2;
	}
	public void setQuestion2(String question2) {
		this.question2 = question2;
	}
	public Map<Integer, String> getAnswers2() {
		return answers2;
	}
	public void setAnswers2(Map<Integer, String> answers2) {
		this.answers2 = answers2;
	}
    
    

    
    
}
