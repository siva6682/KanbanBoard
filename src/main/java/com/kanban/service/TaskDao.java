package com.kanban.service;
import java.util.List;

import com.kanban.entity.Task;




public interface TaskDao {
	List<Task> findAll();

	void insertTask(Task tsk);

	void updateTask(Task tsk);

	void executeUpdateTask(Task tsk);

	public void deleteTask(Task tsk);

	Task findById(Long taskId);

	Task save(Task task);

}
