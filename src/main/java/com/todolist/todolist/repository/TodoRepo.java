package com.todolist.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todolist.todolist.model.TodoItem;

//@Repository    //JPARepository takes care of annotation

public interface TodoRepo extends JpaRepository<TodoItem, Long> //<Type_of_JPA Entity , Type of Primary key>//
{

}
