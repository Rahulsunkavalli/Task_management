package com.example.Task.management.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Task.management.task.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
	

}
