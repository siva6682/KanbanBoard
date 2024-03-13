package com.kanban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kanban.entity.Backlog;
import com.kanban.repository.BacklogRepository;
@RestController
@RequestMapping("/backlog/")
public class BacklogController {
	@Autowired
	 BacklogRepository bRepository;
	@PostMapping("Backlog")
	public Backlog backlogsave(@RequestBody Backlog bsave) {
	
		System.out.println(bsave);
		
		return bRepository.save(bsave) ;
	}
}