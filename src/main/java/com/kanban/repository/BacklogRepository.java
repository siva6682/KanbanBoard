package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanban.entity.Backlog;

@Repository
public interface BacklogRepository extends JpaRepository<Backlog, Integer> {

}
