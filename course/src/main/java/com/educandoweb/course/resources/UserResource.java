package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Task;
import com.educandoweb.course.services.taskService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private taskService service;
	
	@GetMapping
	public ResponseEntity<List<Task>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}

}
