package com.pes2ug19cs138.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pes2ug19cs138.entity.Task;
import com.pes2ug19cs138.service.ToDoListService;

@Controller
public class ToDoListController {
	
	@Autowired
	private ToDoListService service;
	
	@GetMapping("/")
	public String homePage(Model m) {
		List<Task> tasks = service.getAllTasks();
		m.addAttribute("tasks", tasks);
		return "index";
	}
	
	@GetMapping("/addTask")
	public String addTaskForm() {
		return "addTask";
	}
	
	@PostMapping("/addTask")
	public String addNewTask(@ModelAttribute Task newTask, HttpSession session) {
		service.addTask(newTask);
		session.setAttribute("msg", "Task Added Successfully!");
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editTask(@PathVariable int id, Model m) {
		Task returnedTask = service.getTaskById(id);
		m.addAttribute("returnedTask", returnedTask);
		return "editTask";
	}
	
	@PostMapping("/updateTask")
	public String updateTask(@ModelAttribute Task updatedTask, HttpSession session) {
		service.addTask(updatedTask);
		session.setAttribute("upMsg", "Task Updated Successfully!");
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteTask(@PathVariable int id, HttpSession session) {
		service.deleteTask(id);
		session.setAttribute("delMsg", "Task Deleted Successfully!");
		return "redirect:/";
	}
}
