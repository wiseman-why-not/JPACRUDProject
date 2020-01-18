package com.skilldistillery.Thunder.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.Thunder.entities.Team;

class TeamDAOImplTest {

	private static TeamDAOImpl dao = new TeamDAOImpl();
	private Team teamToTest;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
	//	dao = 
		teamToTest = dao.getTeamById(1);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		dao = null;
		teamToTest = null;
	}
	
	@Test
	@DisplayName("testing find team by id")
	void test1() {
		
		assertEquals("Oklahoma City Thunder", teamToTest.getTeamName());
	}

	@Test
	@DisplayName("testing find team by keyword")
	void test2() {
		List<Team> resultList = dao.getTeamByName("under");
		for (Team team : resultList) {
			System.out.println(("**********" + team ));
		}
		
		assertEquals("Oklahoma City Thunder", resultList.get(0).getTeamName());
	}

}
