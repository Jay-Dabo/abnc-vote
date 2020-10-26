package com.ablekumanorthprimaries.election.entity;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Table(name="pollingStationExecutives")
@Entity
public class PollingStationExecutive {
	@Id
	@Column(name="voterId")
	private Long voterId; // Restricted Access

	// Getter
	public Long getVoterId() {
		return voterId;
	}
	
	// Setter
	public void setVoterId(Long voterId) {
		this.voterId = voterId;
	}

	
	
	@Column(name="executiveName")
	private String name; // Restricted Access

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	

	@Column(name="hasvoted")
	private Boolean hasVoted; // Restricted Access

	// Getter
	public Boolean getHasVoted() {
		return hasVoted;
	}

	// Setter
	public void setHasVoted(Boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
	
	
	
	// Constructor
	public PollingStationExecutive() { // Default Constructor
		super();
	}
	
	public PollingStationExecutive(Long voterId, String name, Boolean hasVoted) {
		super();
		this.voterId = voterId;
		this.name = name;
		this.hasVoted = hasVoted;
	}
}