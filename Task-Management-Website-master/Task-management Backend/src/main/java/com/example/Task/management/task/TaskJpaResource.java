package com.example.Task.management.task;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Task.management.task.Repository.TaskRepository;

@RestController
public class TaskJpaResource {
	
	private TaskRepository taskRepository;

	public TaskJpaResource(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}
	
	@GetMapping("/tasks")
	public List<Task> retrieveAllTasks(){
		 return taskRepository.findAll();
	}
	
	@GetMapping("/tasks/{id}")
	public Task retrieveTodo(@PathVariable int id) {
		return taskRepository.findById(id).get();
	}
	
	
	
	@PutMapping("/tasks/{id}")
	public Task updateTask(@PathVariable int id,@RequestBody Task task) {
		taskRepository.save(task);
		return task;
	}
	
	@PostMapping("/tasks")
	public Task addTodo(@RequestBody Task task) {
		task.setId(null);
		return taskRepository.save(task);
	}
	
	@DeleteMapping("/tasks/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable int id) {
		 taskRepository.deleteById(id);
		 return ResponseEntity.noContent().build();
	}
	
	 @GetMapping("/hello")
	 public String retrieveHelloworld() {
		 return "hello ";
	 }
}
