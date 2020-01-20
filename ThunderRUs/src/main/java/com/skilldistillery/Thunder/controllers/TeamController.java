package com.skilldistillery.Thunder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.Thunder.data.TeamDAO;
import com.skilldistillery.Thunder.entities.Team;

@Controller
public class TeamController {
	
	@Autowired
	private TeamDAO dao;

	@RequestMapping(path= {"/", "home.do"}, method = RequestMethod.GET)
	public String home(Model model) {
		model = model.addAttribute("Teams", dao.showAllteams());
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

	
	@RequestMapping(path="/create.do", method = RequestMethod.GET)
	public String create(String keyword, Model model ) {
		
		return "createTeam";
	}
	
	@RequestMapping(path="/createTeamInDB.do", method = RequestMethod.POST)
	public String createTeamInDB(Team team, Model model ) {
		model.addAttribute("team", dao.createTeam(team));
		return "teamDetails";
	}
	
	
	@RequestMapping(path="/update.do", method = RequestMethod.POST)
	public String update(@RequestParam("teamId") Integer teamId, Model model ) {
		model.addAttribute("team", dao.getTeamById(teamId));
		return "editTeam";
	}
	
	@RequestMapping(path="/updateTeamInDB.do", method = RequestMethod.POST)
	public String updateTeamInDB(Team team, Model model ) {
		model.addAttribute("team", dao.updateTeam(team));
		return "teamDetails";
	}



	@RequestMapping(path = "/delete.do", method = RequestMethod.POST)
	public String delete(@RequestParam("teamId") Integer teamId, Model model) {
		System.out.println(" *********** in the delete method in teamController *********");
		Team teamToDelete = dao.getTeamById(teamId);
		System.out.println(teamToDelete);
		model = model.addAttribute("team", dao.deleteTeam(teamToDelete));
		return "deletedTeam";
	}
}
