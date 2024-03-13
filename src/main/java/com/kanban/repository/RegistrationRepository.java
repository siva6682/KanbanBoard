package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanban.entity.RegistrationEntity;
@Repository

public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Integer> {
RegistrationEntity findByEmail(String email);
}
