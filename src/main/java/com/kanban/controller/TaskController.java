package com.kanban.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kanban.entity.Task;
import com.kanban.service.TaskService;

//import com.springboot.example.entity.Task;
//import com.springboot.example.service.TaskService;


@RestController
@RequestMapping("/task")
@CrossOrigin( "http://localhost:4200")
public class TaskController {
	
	@Resource 
	TaskService taskService;
	
	@GetMapping(value = "/taskList")
	public List<Task> getTasklist() {
		return taskService.findAll();
	
	}
	
	@PostMapping(value = "/createTask")
	public void createTask(@RequestBody Task tsk) {
		taskService.insertTask(tsk);
	
	}
	@GetMapping(value="/getById/{taskId}")
	public Task getTaskById(@PathVariable("taskId") Long taskId) {
		return taskService.findById(taskId);
	}
	
	@PutMapping(value = "/updateTask")
	public void updateTask(@RequestBody Task tsk) {
		taskService.updateTask(tsk);
	
	}
	@PutMapping(value = "/executeUpdateTask")
	public void executeupdateTask(@RequestBody Task tsk) {
		taskService.executeUpdateTask(tsk);
	
	}
	
	@PutMapping(value = "/deleteTaskById")
	public void deleteTask(@RequestBody Task tsk) {
		taskService.deleteTask(tsk);
	
	}
	
	
}
