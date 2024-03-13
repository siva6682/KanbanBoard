package com.kanban.service;

import com.kanban.entity.RegistrationEntity;

public interface RegistrationService {

	RegistrationEntity saveRegistrationService(RegistrationEntity registrationEntity);

	RegistrationEntity loginservice(String email, String password);

}
