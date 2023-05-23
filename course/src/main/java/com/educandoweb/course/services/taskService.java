package com.educandoweb.course.services;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Task;
import com.educandoweb.course.repositories.UserRepository;

@Service
public interface taskService {
	
	public List<Task>  getAllTasks() {
		return repository.findAll();
	}
	
}
