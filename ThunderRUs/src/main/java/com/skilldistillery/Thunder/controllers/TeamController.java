package com.skilldistillery.Thunder.controllers;

import javax.servlet.http.HttpSession;

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
	@RequestMapping(path="/getAllTeam.do", method = RequestMethod.GET)
	public String getAllTeams(@RequestParam("teamId") Integer teamId, Model model ) {
		model = model.addAttribute("team", dao.getTeamById(teamId));
		
		return "teamDetails";
	}
	
	@RequestMapping(path="/createTeam.do", method = RequestMethod.GET)
	public String create(String keyword, Model model ) {
		model = model.addAttribute("Teams", dao.getTeamByName(keyword));
		return "editTeam";
	}
	
	@RequestMapping(path="/update.do", method = RequestMethod.POST)
	public String update(@RequestParam("teamId") Integer teamId, Model model ) {
		model.addAttribute("team", dao.getTeamById(teamId));
		return "editTeam";
	}


	@RequestMapping(path = "/delete.do", method = RequestMethod.GET)
	public String delete(@RequestParam("teamId") Integer teamId, Model model) {
		model = model.addAttribute("Teams", dao.getTeamById(teamId));
		return "foundTeams";
	}
}
