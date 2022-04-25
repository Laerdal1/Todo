package com.todolist.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.todolist.model.TodoItem;

public interface TodoRepo extends JpaRepository<TodoItem, Long>{

}
