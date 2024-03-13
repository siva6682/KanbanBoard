package com.kanban.service;



import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanban.entity.RegistrationEntity;
import com.kanban.repository.RegistrationRepository;
@Service
public class RegistraationServiceImpl implements RegistrationService {
	@Autowired
	RegistrationRepository rRepository;

	@Override
	public RegistrationEntity saveRegistrationService(RegistrationEntity registrationEntity) {
		
		RegistrationEntity newreg=new  RegistrationEntity();
		newreg.setEmail(registrationEntity.getEmail());
		String str=registrationEntity.getPassword();
        Base64.Encoder simpleEncoder = Base64.getEncoder();
         // Encoding string using simple encode
        String encodedString = simpleEncoder.encodeToString(str.getBytes());
       newreg.setPassword(encodedString);
       newreg.setUserName(registrationEntity.getUserName());
		
		return rRepository.save(newreg);
	}

	@Override
	public RegistrationEntity loginservice(String email, String password) {
		RegistrationEntity newreg=rRepository.findByEmail(email);
		String encodedString=newreg.getPassword();
		 Base64.Decoder simpleDecoder = Base64.getDecoder();
         
	        // Decoding the encoded string using decoder
	        String decodedString = new String(simpleDecoder.decode(encodedString.getBytes()));
		if(email.equals(newreg.getEmail())&&password.equals(decodedString)) {
			return newreg;
		}
		
		return null;
	}

}
