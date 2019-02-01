package com.todomvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String issue;
	
	private boolean completed;
	
	public Todo() {		
	}
	
	public Todo(String issue, boolean completed) {
		this.issue = issue;
		this.completed = completed;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIssue() {
		return issue;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

}
