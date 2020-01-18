package com.skilldistillery.Thunder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.Thunder.data.TeamDAO;
import com.skilldistillery.Thunder.data.TeamDAOImpl;

@Controller
public class TeamController {
	
	private static TeamDAO dao = new TeamDAOImpl();

	@RequestMapping(path= {"/", "home.do"}, method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(path="search.do", method = RequestMethod.GET)
	public String seachResults(@RequestParam("searchKeyword") String keyword, Model model ) {
		
		model = model.addAttribute("Teams", dao.getTeamByName(keyword));
		return "foundTeams";
	}
}
