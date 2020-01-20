package com.skilldistillery.Thunder.data;

import java.util.List;

import com.skilldistillery.Thunder.entities.Team;

public interface TeamDAO {
	
	public Team getTeamById(int teamId);
	
	public List<Team> getTeamByName(String teamName);

	public Team updateTeam(Team team);

	public Team createTeam(Team team);

	Team deleteTeam(Team team);

	List<Team> showAllteams();

}
