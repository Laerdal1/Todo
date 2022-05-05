package com.todolist.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.todolist.model.TodoItem;
import com.todolist.todolist.repository.TodoRepo;
import com.todolist.todolist.service.TodoService;


//@RestController
@Controller
//@RequestMapping(value = "/todo")
public class TodoController {
	
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	//handler method to handle list TodoItems and return mode and view.

	@GetMapping("/todo")
	public String listTodoItems(Model model) {
		model.addAttribute("TodoItem", todoService.getAllTodoItems());
		return "todoItem";		//todoItems view      view is coded under resources-> template -> todoItems.html
								//view resolver is auto configured in springboot for thymeleaF
								//thymeleaf dependency is added in pom it autoconfigures.
		
		//controller -> listtodoItem handler method -> model has a list of students -> displayed in view html(template)
	}
	
	@GetMapping("/todo/new")
	public String createTodoTask(Model model) {
		TodoItem todoItem1 = new TodoItem();
		model.addAttribute("TodoItem",todoItem1);
		return "createTask";
		
	}
	@PostMapping("/todoNew")
	public String saveTask(@ModelAttribute("TodoItem") TodoItem todoItem) {
		todoService.saveTodo(todoItem);
		return "redirect:/todo";
		
	}
	
/*	@Autowired
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
	*/
}
