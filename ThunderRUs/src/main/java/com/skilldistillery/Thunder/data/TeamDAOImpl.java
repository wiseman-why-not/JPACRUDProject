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


	//private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("thunder");

	@PersistenceContext
	private EntityManager em;

	@Override
	public Team getTeamById(int teamId) {
//		em = emf.createEntityManager();

		
		
		return em.find(Team.class, teamId);
	}

	@Override
	public List<Team> getTeamByName(String teamName) {
//		em = emf.createEntityManager();

		// query search
		String queryStatement = "SELECT team FROM Team team WHERE teamName LIKE :keyword";

		List<Team> queryResults = em.createQuery(queryStatement, Team.class).setParameter("keyword", "%" +teamName + "%")
				.getResultList();

		return queryResults;
	}
	

	

}
