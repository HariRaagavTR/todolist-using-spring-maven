package com.pes2ug19cs138.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pes2ug19cs138.entity.Task;
import com.pes2ug19cs138.repository.ToDoListRepo;

@Service
public class ToDoListService {
	@Autowired
	private ToDoListRepo repo;
	
	public void addTask(Task newTask) {
		repo.save(newTask);
	}
	
	public List<Task> getAllTasks() {
		return repo.findAll();
	}
	
	public Task getTaskById(int id) {
		Optional<Task> returnedTask = repo.findById(id);
		if(returnedTask.isPresent()) {
			return returnedTask.get();
		}
		return null;
	}
	
	public void deleteTask(int id) {
		repo.deleteById(id);
	}
}
