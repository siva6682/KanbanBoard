package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanban.entity.CreateProject;
@Repository
public interface CreateProjectRepository extends JpaRepository<CreateProject, Integer> {

}
