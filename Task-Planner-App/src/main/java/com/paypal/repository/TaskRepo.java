package com.paypal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paypal.entity.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer>{
	
	
    List<Task> findByAssignee(String assignee);

}
