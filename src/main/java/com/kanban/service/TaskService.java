package com.kanban.service;


import java.util.List;

import com.kanban.entity.Task;


//import com.springboot.example.entity.Task;

public interface TaskService {
	List<Task> findAll();

	void insertTask(Task tsk);
	Task findById(Long taskId);

	void updateTask(Task tsk);

	void executeUpdateTask(Task tsk);

	void deleteTask(Task tsk);

}
