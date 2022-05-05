package com.todolist.todolist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

//import org.apache.commons.lang3.StringUtils;


@Entity
@Table(name = "todo")
public class TodoItem {

	
	private long id;
	
	private String task;
	private String status;
	
	private boolean done;
	
	public TodoItem() {
		
	}

	public TodoItem(String task, String status, boolean done) {
		super();
		this.task = task;
		this.status = status;
		this.done = done;
	}





	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}



}
