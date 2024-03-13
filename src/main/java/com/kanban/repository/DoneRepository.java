package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanban.entity.Done;

@Repository
public interface DoneRepository extends JpaRepository<Done , Integer> {

}
