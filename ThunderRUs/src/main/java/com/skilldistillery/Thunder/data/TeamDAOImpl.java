  
package com.skilldistillery.Thunder.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.Thunder.entities.Team;

@Service
@Transactional
public class TeamDAOImpl implements TeamDAO {


//	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("thunder");

	@PersistenceContext
	private EntityManager em;

	@Override
	public Team getTeamById(int teamId) {
//		em = emf.createEntityManager();
		Team foundTeam = em.find(Team.class, teamId);
		System.out.println(foundTeam);
		return foundTeam;
		//return em.find(Team.class, teamId);
	}

	@Override
	public List<Team> getTeamByName(String teamName) {
//		em = emf.createEntityManager();

		// query search
		String queryStatement = "SELECT team FROM Team team WHERE teamName LIKE :keyword";

		List<Team> queryResults = em.createQuery(queryStatement, Team.class).setParameter("keyword", "%" +teamName + "%")
				.getResultList();
		for (Team team : queryResults) {
			System.out.println(team.getTeamName());
		}

		return queryResults;
	}
	@Override
	public Team createTeam(Team team) {

		
		em.persist(team);
		em.flush();
		System.out.println(team);
		return team;
		//return em.find(Team.class, teamId);
	}
	
	@Override
	public Team deleteTeam(Team team) {
		Team foundTeam = em.find(Team.class, team.getId());

		System.out.println("Team that will be removed" + foundTeam);
		em.remove(foundTeam);
		em.flush();
		return foundTeam;
		//return em.find(Team.class, teamId);
	}
	
	@Override
	public Team updateTeam(Team team) {
		// query search
		
		Team foundTeam = em.find(Team.class, team.getId());
		foundTeam.setTeamName(team.getTeamName());
		foundTeam.setGamesPlayed(team.getGamesPlayed());
		foundTeam.setPointsScoredAverage(team.getPointsScoredAverage());
		foundTeam.setWins(team.getWins());
		foundTeam.setLosses(team.getLosses());
		foundTeam.setWinLossPercentage(team.getWinLossPercentage());
		foundTeam.setFieldGoalAttempt(team.getFieldGoalAttempt());
		foundTeam.setFieldGoalMade(team.getFieldGoalMade());
		foundTeam.setFieldGoalPercentage(team.getFieldGoalPercentage());
		foundTeam.setThreePointAttempt(team.getThreePointAttempt());
		foundTeam.setThreePointMade(team.getThreePointMade());
		foundTeam.setThreePointPercentage(team.getThreePointPercentage());
		foundTeam.setFreeThrowAttempt(team.getFreeThrowAttempt());
		foundTeam.setFreeThrowMade(team.getFreeThrowMade());
		foundTeam.setFreeThrowPercentage(team.getFreeThrowPercentage());
		foundTeam.setReboundsAverage(team.getReboundsAverage());
		foundTeam.setOffensiveRebound(team.getOffensiveRebound());
		foundTeam.setDefensiveRebound(team.getDefensiveRebound());
		foundTeam.setAssists(team.getAssists());
		foundTeam.setTurnOvers(team.getTurnOvers());
		foundTeam.setBlocks(team.getBlocks());
		foundTeam.setPersonalFouls(team.getPersonalFouls());
		foundTeam.setLogo(team.getLogo());
		
		return foundTeam;
	}
	
	@Override
	public List<Team> showAllteams(){
		// query getting all teams in database.
		String queryStatement = "SELECT team FROM Team team";
		List<Team> allTeams = em.createQuery(queryStatement, Team.class).getResultList();
		
		return allTeams;
	}

}