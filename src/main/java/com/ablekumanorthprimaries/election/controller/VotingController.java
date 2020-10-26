package com.ablekumanorthprimaries.election.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ablekumanorthprimaries.election.entity.Candidate;
import com.ablekumanorthprimaries.election.entity.PollingStationExecutive;
import com.ablekumanorthprimaries.election.repositories.CandidateRepo;
import com.ablekumanorthprimaries.election.repositories.PollingStationExecutiveRepo;

@Controller
public class VotingController {

	@Autowired
	PollingStationExecutiveRepo pollingstationexecutiveRepo;
	
	@Autowired
	CandidateRepo candidateRepo;

	@RequestMapping("/") // Direct Visitor straight to Voting page on WebApp
	public String goToVote() {
		return "home.html";
	}

//	@RequestMapping("/doLogin")
	@RequestMapping(value="/doLogin", method=RequestMethod.POST)
    public String doLogin(HttpServletRequest request, Model model, Long voterId, String name) throws Exception {
        
//	public String doLogin(@RequestParam (required = true) Long voterId, @RequestParam String name, Model model) {

		PollingStationExecutive executive = pollingstationexecutiveRepo.findByVoterId(voterId);
//		if(executive == null) executive = 0;

		if (!executive.getHasVoted()) {
			List<Candidate> candidates = candidateRepo.findByName(name);
			model.addAttribute("candidates",candidates);
			return "/vote.html";
		} else {
			return "/voteAlert.html";
		}
	}
}