package com.kanban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kanban.entity.InProgress;
import com.kanban.repository.InProgressRepository;
@RestController
@RequestMapping("/inprogress/")
public class InProgressController {
	@Autowired
	 InProgressRepository iRepository;
	@PostMapping("inprogress")
	public InProgress inprogresssave(@RequestBody InProgress Isave) {
	
		System.out.println(Isave);
		
		return iRepository.save(Isave) ;
	}
}