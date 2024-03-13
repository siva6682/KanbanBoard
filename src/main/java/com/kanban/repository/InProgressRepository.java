package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanban.entity.InProgress;

@Repository
public interface InProgressRepository extends JpaRepository<InProgress, Integer> {

}
