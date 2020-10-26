package com.ablekumanorthprimaries.election.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ablekumanorthprimaries.election.entity.Candidate;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate,Long> {
	public Candidate findByVoterId(Long voterId);
	public List<Candidate> findByName(String name);
}