package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Task;

public interface UserRepository extends JpaRepository<Task, Long> {}
