package com.todolist.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.todolist.todolist.model.TodoItem;
import com.todolist.todolist.repository.TodoRepo;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Autowired
	private TodoRepo todoRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * TodoItem todoItem1 = new TodoItem("Nrp Testing","InProgress",true);
		 * todoRepo.save(todoItem1);
		 */ 
		
	}

	

}
