package com.paypal.entity;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;

@Entity
public class Task {
	
	@Id
	private int id;
    private String type;
    private String name;
    private String description;
    private String assignee;
    private String status;
    
   public Task() {
	// TODO Auto-generated constructor stub
}

	public Task(int id, String type, String name, String description, String assignee, String status) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.description = description;
		this.assignee = assignee;
		this.status = status;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", type=" + type + ", name=" + name + ", description=" + description + ", assignee="
				+ assignee + ", status=" + status + "]";
	}

	
    
    

}
