package com.todomvc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.todomvc.models.Todo;
import com.todomvc.service.TodoService;

@Named
@ViewScoped
public class ClientController {

	@Autowired
	private TodoService todoService;

	private String issue;
	private int contActives;
	private List<Todo> todos;


	@PostConstruct
	public void init() {
		findAll();
	}

	public void changeStatus(Todo todo ) {	
		todoService.save(todo); 
		contActives();
	}
	
	public void delete(Todo todo ) {
		todoService.delete(todo); 
		findAll();
	}
	
	public void deleteAll() {
		
		for (Todo todo : todos) {
			if(todo.isCompleted()) {
				todoService.delete(todo); 				
			}
		}
		
		findAll();		
		
	}

	public void findAll() {
		todos = new ArrayList<>();		
		todos = todoService.findAll();

		contActives();
	}

	public void contActives() {
		contActives = 0;

		for (Todo todo : todos) {
			if(!todo.isCompleted()) {
				contActives++;
			}
		}
	}

	public void findCompleted() {
		todos = todoService.findByCompleted(true);
	}

	public void findActive() {
		todos = todoService.findByCompleted(false);
	}

	public void update(Todo todo) {
		todoService.save(todo);
		findAll();
	}

	public void newtodo() {		
		if(issue != null && !issue.isEmpty()) {
			Todo todo = new Todo(issue, false);
			todoService.save(todo);
			findAll();

			issue = "";
		}

	}

	public int getContActives() {
		return contActives;
	}

	public void setContActives(int contActives) {
		this.contActives = contActives;
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}
}
