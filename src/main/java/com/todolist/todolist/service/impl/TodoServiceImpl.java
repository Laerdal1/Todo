package com.todolist.todolist.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todolist.todolist.model.TodoItem;
import com.todolist.todolist.repository.TodoRepo;
import com.todolist.todolist.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService{
	
	private TodoRepo todoRepo;
	
//If only one constructor no need for using @void annotation
	
	public TodoServiceImpl(TodoRepo todoRepo) {
		super();
		this.todoRepo = todoRepo;
	}


	@Override
	public List<TodoItem> getAllTodoItems() {
		
		return todoRepo.findAll();
	}


	@Override
	public TodoItem saveTodo(TodoItem todoItem) {
		
		return todoRepo.save(todoItem);
	}

}
