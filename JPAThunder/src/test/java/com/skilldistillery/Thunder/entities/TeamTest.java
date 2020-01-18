package com.skilldistillery.Thunder.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TeamTest {
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private Team team;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("thunder");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		team = em.find(Team.class, 1);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		team = null;
	}

	@Test
	@DisplayName("testing get team field goal attempt method")
	void test1() {
		assertEquals(85.3, team.getFieldGoalAttempt());
	}
	
	@Test
	@DisplayName("testing get team ield goal made method")
	void test2() {
		assertEquals(39.9, team.getFieldGoalMade());
	}
	
	@Test
	@DisplayName("testing get team ield goal percentage method")
	void test3() {
		assertEquals(46.70, team.getFieldGoalPercentage());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test4() {
		assertEquals(30.1, team.getThreePointAttempt());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test5() {
		assertEquals(10.3, team.getThreePointMade());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test6() {
		assertEquals(34.30, team.getThreePointPercentage());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test7() {
		assertEquals(24.3, team.getFreeThrowAttempt());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test8() {
		assertEquals(19.4, team.getFreeThrowMade());
	}
	

	
	@Test
	@DisplayName("testing get team name method")
	void test9() {
		assertEquals(79.80, team.getFreeThrowPercentage());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test10() {
		assertEquals(43.4, team.getReboundsAverage());
	}
	
	@Test
	@DisplayName("testing get team offensive rebound method")
	void test11() {
		assertEquals(8.5, team.getOffensiveRebound());
	}
	
	@Test
	@DisplayName("testing get team defensive rebound method")
	void test12() {
		assertEquals(34.9, team.getDefensiveRebound());
	}
	
	@Test
	@DisplayName("testing get team assists method")
	void test13() {
		assertEquals(21.7, team.getAssists());
	}
	
	@Test
	@DisplayName("testing get team turn overs method")
	void test14() {
		assertEquals(14, team.getTurnOvers());
	}
	
	@Test
	@DisplayName("testing get team blocks method")
	void test15() {
		assertEquals(4.8 , team.getBlocks());
	}
	
	@Test
	@DisplayName("testing get team personal foulds method")
	void test16() {
		assertEquals(18.8 , team.getPersonalFouls());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test17() {
		assertEquals(.56, team.getWinLossPercentage());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test18() {
		assertEquals(23, team.getWins());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test19() {
		assertEquals(18, team.getLosses());
	}
	@Test
	@DisplayName("testing get team name method")
	void test20() {
		assertEquals(109.4, team.getPointsScoredAverage());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test21() {
		assertEquals(41, team.getGamesPlayed());
	}
	
	@Test
	@DisplayName("testing get team name method")
	void test22() {
		assertEquals("Oklahoma City Thunder", team.getTeamName());
	}

}
