package com.example.Task.management.task;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Task {
	
	public  Task() {
		
	}
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String title;
	
	private String description;
	
	private LocalDate startDate;
	
	private LocalDate dueDate;
	
	private String status;
	
	private Integer now;
	
	private String peopleworking;
	
	private String priority;
	
	
	public Task(Integer id, String title, String description, LocalDate startDate, LocalDate dueDate, String status,
			Integer now, String peopleworking, String priority) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.status = status;
		this.now = now;
		this.peopleworking = peopleworking;
		this.priority = priority;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getNow() {
		return now;
	}

	public void setNow(Integer now) {
		this.now = now;
	}

	

	

	public String getPeopleworking() {
		return peopleworking;
	}

	public void setPeopleworking(String peopleworking) {
		this.peopleworking = peopleworking;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", startDate=" + startDate
				+ ", dueDate=" + dueDate + ", status=" + status + ", now=" + now + ", peopleworking=" + peopleworking
				+ ", priority=" + priority + "]";
	}

}
