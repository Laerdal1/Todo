package com.todolist.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.todolist.model.TodoItem;
import com.todolist.todolist.repository.TodoRepo;


@RestController
@RequestMapping(value = "/todo")
public class TodoController {
	
	@Autowired
	private TodoRepo todoRepo;
	
	@GetMapping
	public List<TodoItem> findAll(){
		return todoRepo.findAll();
		
	}
	
	@PostMapping
	public TodoItem save(@Validated @NonNull @RequestBody TodoItem todoItem) {
		
		return todoRepo.save(todoItem);
	}
	
	@PutMapping
	public TodoItem update(@Validated @NonNull @RequestBody TodoItem todoItem) {
		
		return todoRepo.save(todoItem);
	}
	
	@DeleteMapping(value = "/{id}")
	public List<TodoItem> TodoItemdelete(@PathVariable Long id) {
		todoRepo.deleteById(id);
		
		return todoRepo.findAll();
	}
}
