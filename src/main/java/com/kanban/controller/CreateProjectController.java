package com.kanban.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kanban.entity.CreateProject;
import com.kanban.repository.CreateProjectRepository;
@RestController
@RequestMapping("/project/")
@CrossOrigin( "http://localhost:4200")
public class CreateProjectController {
	@Autowired
	CreateProjectRepository rRepository;
	@PostMapping("createproject")
	public CreateProject cprojectsave(@RequestBody CreateProject cproject) {
	
		System.out.println(cproject);
		
		return rRepository.save(cproject) ;
	}
	
	@GetMapping("getProjectName")
	public List<CreateProject> getProjectList() {
		
		return rRepository.findAll();
	}
}
