package com.ablekumanorthprimaries.election.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ablekumanorthprimaries.election.entity.PollingStationExecutive;

@Repository
public interface PollingStationExecutiveRepo extends JpaRepository<PollingStationExecutive,Long> {
	public PollingStationExecutive findByVoterId(Long voterId);
}