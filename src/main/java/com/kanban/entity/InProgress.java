package com.kanban.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Inprogress")
public class InProgress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String work_in_progress;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWork_in_progress() {
		return work_in_progress;
	}
	public void setWork_in_progress(String work_in_progress) {
		this.work_in_progress = work_in_progress;
	}
    
	
}
