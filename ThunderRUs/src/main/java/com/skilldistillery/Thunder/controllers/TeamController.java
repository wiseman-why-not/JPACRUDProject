package com.skilldistillery.Thunder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.Thunder.data.TeamDAO;

@Controller
public class TeamController {
	
	@Autowired
	private TeamDAO dao;

	@RequestMapping(path= {"/", "home.do"}, method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(path="/search.do", method = RequestMethod.POST)
	public String seachResults(@RequestParam("searchKeyword") String keyword, Model model ) {
		model = model.addAttribute("Teams", dao.getTeamByName(keyword));
		return "foundTeams";
	}
	
	@RequestMapping(path="/getTeam.do", method = RequestMethod.GET)
	public String getSingleTeam(@RequestParam("teamId") Integer teamId, Model model ) {
		model = model.addAttribute("team", dao.getTeamById(teamId));
		
		return "teamDetails";
	}
}
