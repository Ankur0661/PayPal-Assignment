package com.paypal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.paypal.entity.Task;
import com.paypal.repository.TaskRepo;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepo taskRepo;
	
	public List<Task> getAllTasks(){
		
		return taskRepo.findAll();
	}
	
	public Task editTaskById(int id) {
		
		Optional<Task> ts = taskRepo.findById(id);
		
		if(ts.isPresent()) {
			return ts.get();
		}
		
		return null;
	}

    public void addTask(Task task) {
    	taskRepo.save(task);
    }

    public void deleteTask(Task task) {
    	taskRepo.delete(task);
    }

}
