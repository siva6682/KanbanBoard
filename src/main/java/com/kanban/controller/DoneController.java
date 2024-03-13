package com.kanban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kanban.entity.Done;
import com.kanban.repository.DoneRepository;

@RestController
@RequestMapping("/done/")
public class DoneController {
	@Autowired
	DoneRepository dRepository;
	@PostMapping("Done")
	public Done donesave(@RequestBody Done Dsave) {
	
		System.out.println(Dsave);
		
		return dRepository.save(Dsave) ;
	}
}