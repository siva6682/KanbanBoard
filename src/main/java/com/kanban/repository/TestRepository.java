package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanban.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {

}

