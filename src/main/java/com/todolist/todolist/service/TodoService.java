package com.todolist.todolist.service;

import java.util.List;

import com.todolist.todolist.model.TodoItem;

public interface TodoService {
	
	List<TodoItem> getAllTodoItems();	//List<Entity type>  list=> java.util
	
	TodoItem saveTodo(TodoItem todoItem);
	
	TodoItem getTaskById(Long id);
	
	TodoItem UpdateTask(TodoItem todoItem);
	
	void deleteTaskById(Long id);
}
