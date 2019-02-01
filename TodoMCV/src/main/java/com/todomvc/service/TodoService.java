package com.todomvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todomvc.models.Todo;
import com.todomvc.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public void save(Todo todo){
		todoRepository.saveAndFlush(todo);
	}
	
	public List<Todo> findAll(){
		return todoRepository.findAll();
	}
	
	public List<Todo> findByCompleted(boolean completed){
		return todoRepository.findByCompleted(completed);
	}
	
	public void delete(Todo todo){
		todoRepository.delete(todo);
	}
	
}
