package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanban.entity.PeerReview;


@Repository
public interface PeerReviewRepository extends JpaRepository<PeerReview, Integer> {

	//PeerReview post(PeerReview psave);

}
