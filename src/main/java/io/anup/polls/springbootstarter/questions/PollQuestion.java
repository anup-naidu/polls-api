package io.anup.polls.springbootstarter.questions;

public class PollQuestion {

	private String question;
	private String published_at;
	private String choices;
	
	public PollQuestion() {
		
	}
	
	
	public PollQuestion(String question, String published_at, String choices) {
		super();
		this.question = question;
		this.published_at = published_at;
		this.choices = choices;
	}
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getPublished_at() {
		return published_at;
	}
	public void setPublished_at(String published_at) {
		this.published_at = published_at;
	}
	public String getChoices() {
		return choices;
	}
	public void setChoices(String choices) {
		this.choices = choices;
	}
}
