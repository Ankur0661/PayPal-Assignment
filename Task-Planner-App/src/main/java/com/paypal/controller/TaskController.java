package com.paypal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.paypal.entity.Task;
import com.paypal.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService ts;
	
	@GetMapping("/")
	public String home(Model model) {
		
		List<Task> tasks = ts.getAllTasks();
		
		model.addAttribute("tasks", tasks);
		
		return "index";
	}
	
	@GetMapping("/addemp")
	public String addTaskpage() {
		return "addemp";
	}
	
	@PostMapping("/register")
	public String addTasks(@ModelAttribute Task t) {
		
		ts.addTask(t);
		
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editTasks(@PathVariable int id, Model m) {
		
		Task e = ts.editTaskById(id);
		
		m.addAttribute("emp", e);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Task e) {
		
		ts.addTask(e);
		
		return "redirect:/";
		
	}

}
