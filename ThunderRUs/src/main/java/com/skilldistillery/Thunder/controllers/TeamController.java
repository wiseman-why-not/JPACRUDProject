package com.skilldistillery.Thunder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TeamController {

	@RequestMapping(path= {"/", "home.do"}, method = RequestMethod.GET)
	public String home() {
		return "home";
	}
}
