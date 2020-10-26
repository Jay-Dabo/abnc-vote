package com.ablekumanorthprimaries.election.entity;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Table(name="candidates")
@Entity
public class Candidate {
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

	
	
	@Column(name="candidateName")
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
	public Candidate() { // Default Constructor
		super();
	}
	
	public Candidate(Long voterId, String name, Boolean hasVoted) {
		super();
		this.voterId = voterId;
		this.name = name;
		this.hasVoted = hasVoted;
	}
	
	
	
	@Column(name="voteCount")
	// Vote Counts
		private Integer votes;
	
	// Getter
	public Integer getVotes() {
		return votes;
	}

	// Setter
	public void setVotes(Integer votes) {
		this.votes = votes;
	}

}