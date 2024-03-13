package com.kanban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kanban.entity.RegistrationEntity;
import com.kanban.service.RegistrationService;


@RestController
@RequestMapping("/api/login")
@CrossOrigin("http://localhost:4200")
public class RegistrationController {
	@Autowired
	RegistrationService rService;
	
	//http:localhost:8080/api/login/registration
	@PostMapping("/registration")
	public RegistrationEntity registrationForm(@RequestBody RegistrationEntity registrationEntity) {
		
		return rService.saveRegistrationService(registrationEntity) ;
	}
	
		
	/*@PostMapping("/loginform/{email}/{password}")
	public String loginform(@PathVariable("email")String email,@PathVariable("password")String password ) {
		return rService.loginservice(email,password);
	}*/
	@PutMapping("/loginform/{email}/{password}")
	public RegistrationEntity loginform(@PathVariable("email") String email, @PathVariable("password") String passowrd, 
			@RequestBody Object obj) {
		return rService.loginservice( email,passowrd);
	}
}
