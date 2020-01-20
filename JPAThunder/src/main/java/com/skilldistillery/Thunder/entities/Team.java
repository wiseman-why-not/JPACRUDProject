package com.skilldistillery.Thunder.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

	// fields
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "team_name")
	private String teamName;

	@Column(name = "games_played")
	private Integer gamesPlayed;
	
	@Column(name = "points_scored_average")
	private Double pointsScoredAverage;

	@Column(name = "wins")
	private Integer wins;
	
	@Column(name = "losses")
	private Integer losses;
	
	@Column(name = "win_loss_percentage")
	private Double winLossPercentage;
	
	@Column(name = "field_goal_attempt")
	private Double fieldGoalAttempt;
	
	@Column(name = "field_goal_made")
	private Double fieldGoalMade;
	
	@Column(name = "field_goal_percentage")
	private Double fieldGoalPercentage;
	
	@Column(name = "three_point_attempt")
	private Double threePointAttempt;
	
	@Column(name = "three_point_made")
	private Double threePointMade;
	
	@Column(name = "three_point_percentage")
	private Double threePointPercentage;
	
	@Column(name = "free_throw_attempt")
	private Double freeThrowAttempt;
	
	@Column(name = "free_throw_made")
	private Double freeThrowMade;
	
	@Column(name = "free_throw_percentage")
	private Double freeThrowPercentage;
	
	@Column(name = "rebounds_average")
	private Double reboundsAverage;
	
	@Column(name = "offensive_rebound")
	private Double offensiveRebound;
	
	@Column(name = "defensive_rebound")
	private Double defensiveRebound;
	
	@Column(name = "assists")
	private Double assists;
	
	@Column(name = "turn_overs")
	private Double turnOvers;
	
	@Column(name = "steals")
	private Double steals;
	
	@Column(name = "blocks")
	private Double blocks;
	
	@Column(name = "personal_fouls")
	private Double personalFouls;

	@Column(name = "logo")
	private String logo;

	// constructors
	
	public Team() {
		super();
	}

	public Team(int id, String teamName) {
		super();
		this.id = id;
		this.teamName = teamName;
	}
	

	public Team(int id, String teamName, Integer gamesPlayed, Double pointsScoredAverage, Integer wins, Integer losses,
			Double winLossPercentage, Double fieldGoalAttempt, Double fieldGoalMade, Double fieldGoalPercentage,
			Double threePointAttempt, Double threePointMade, Double threePointPercentage, Double freeThrowAttempt,
			Double freeThrowMade, Double freeThrowPercentage, Double reboundsAverage, Double offensiveRebound,
			Double defensiveRebound, Double assists, Double turnOvers, Double steals, Double blocks,
			Double personalFouls, String logo) {
		super();
		this.id = id;
		this.teamName = teamName;
		this.gamesPlayed = gamesPlayed;
		this.pointsScoredAverage = pointsScoredAverage;
		this.wins = wins;
		this.losses = losses;
		this.winLossPercentage = winLossPercentage;
		this.fieldGoalAttempt = fieldGoalAttempt;
		this.fieldGoalMade = fieldGoalMade;
		this.fieldGoalPercentage = fieldGoalPercentage;
		this.threePointAttempt = threePointAttempt;
		this.threePointMade = threePointMade;
		this.threePointPercentage = threePointPercentage;
		this.freeThrowAttempt = freeThrowAttempt;
		this.freeThrowMade = freeThrowMade;
		this.freeThrowPercentage = freeThrowPercentage;
		this.reboundsAverage = reboundsAverage;
		this.offensiveRebound = offensiveRebound;
		this.defensiveRebound = defensiveRebound;
		this.assists = assists;
		this.turnOvers = turnOvers;
		this.steals = steals;
		this.blocks = blocks;
		this.personalFouls = personalFouls;
		this.logo = logo;
	}


	public Team(int id, String teamName, Integer gamesPlayed, Double pointsScoredAverage, Integer wins,
			Integer losses) {
		super();
		this.id = id;
		this.teamName = teamName;
		this.gamesPlayed = gamesPlayed;
		this.pointsScoredAverage = pointsScoredAverage;
		this.wins = wins;
		this.losses = losses;
	}
	
//	public Team(int id, String teamName, Integer gamesPlayed, Double pointsScoredAverage, Integer wins, Integer losses,
//			Double winLossPercentage, Double fieldGoalAttempt, Double fieldGoalMade, Double fieldGoalPercentage,
//			Double threePointAttempt, Double threePointMade, Double threePointPercentage, Double freeThrowAttempt,
//			Double freeThrowMade, Double freeThrowPercentage, Double reboundsAverage, Double offensiveRebound,
//			Double defensiveRebound, Double assists, Double turnOvers, Double steals, Double blocks,
//			Double personalFouls) {
//		super();
//		this.id = id;
//		this.teamName = teamName;
//		this.gamesPlayed = gamesPlayed;
//		this.pointsScoredAverage = pointsScoredAverage;
//		this.wins = wins;
//		this.losses = losses;
//		this.winLossPercentage = winLossPercentage;
//		this.fieldGoalAttempt = fieldGoalAttempt;
//		this.fieldGoalMade = fieldGoalMade;
//		this.fieldGoalPercentage = fieldGoalPercentage;
//		this.threePointAttempt = threePointAttempt;
//		this.threePointMade = threePointMade;
//		this.threePointPercentage = threePointPercentage;
//		this.freeThrowAttempt = freeThrowAttempt;
//		this.freeThrowMade = freeThrowMade;
//		this.freeThrowPercentage = freeThrowPercentage;
//		this.reboundsAverage = reboundsAverage;
//		this.offensiveRebound = offensiveRebound;
//		this.defensiveRebound = defensiveRebound;
//		this.assists = assists;
//		this.turnOvers = turnOvers;
//		this.steals = steals;
//		this.blocks = blocks;
//		this.personalFouls = personalFouls;
//	}

	// methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(Integer gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public Double getPointsScoredAverage() {
		return pointsScoredAverage;
	}

	public void setPointsScoredAverage(Double pointsScoredAverage) {
		this.pointsScoredAverage = pointsScoredAverage;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getLosses() {
		return losses;
	}

	public void setLosses(Integer losses) {
		this.losses = losses;
	}

	public Double getWinLossPercentage() {
		return winLossPercentage;
	}

	public void setWinLossPercentage(Double winLossPercentage) {
		this.winLossPercentage = winLossPercentage;
	}

	public Double getFieldGoalAttempt() {
		return fieldGoalAttempt;
	}

	public void setFieldGoalAttempt(Double fieldGoalAttempt) {
		this.fieldGoalAttempt = fieldGoalAttempt;
	}

	public Double getFieldGoalMade() {
		return fieldGoalMade;
	}

	public void setFieldGoalMade(Double fieldGoalMade) {
		this.fieldGoalMade = fieldGoalMade;
	}

	public Double getFieldGoalPercentage() {
		return fieldGoalPercentage;
	}

	public void setFieldGoalPercentage(Double fieldGoalPercentage) {
		this.fieldGoalPercentage = fieldGoalPercentage;
	}

	public Double getThreePointAttempt() {
		return threePointAttempt;
	}

	public void setThreePointAttempt(Double threePointAttempt) {
		this.threePointAttempt = threePointAttempt;
	}

	public Double getThreePointMade() {
		return threePointMade;
	}

	public void setThreePointMade(Double threePointMade) {
		this.threePointMade = threePointMade;
	}

	public Double getThreePointPercentage() {
		return threePointPercentage;
	}

	public void setThreePointPercentage(Double threePointPercentage) {
		this.threePointPercentage = threePointPercentage;
	}

	public Double getFreeThrowAttempt() {
		return freeThrowAttempt;
	}

	public void setFreeThrowAttempt(Double freeThrowAttempt) {
		this.freeThrowAttempt = freeThrowAttempt;
	}

	public Double getFreeThrowMade() {
		return freeThrowMade;
	}

	public void setFreeThrowMade(Double freeThrowMade) {
		this.freeThrowMade = freeThrowMade;
	}

	public Double getFreeThrowPercentage() {
		return freeThrowPercentage;
	}

	public void setFreeThrowPercentage(Double freeThrowPercentage) {
		this.freeThrowPercentage = freeThrowPercentage;
	}

	public Double getReboundsAverage() {
		return reboundsAverage;
	}

	public void setReboundsAverage(Double reboundsAverage) {
		this.reboundsAverage = reboundsAverage;
	}

	public Double getOffensiveRebound() {
		return offensiveRebound;
	}

	public void setOffensiveRebound(Double offensiveRebound) {
		this.offensiveRebound = offensiveRebound;
	}

	public Double getDefensiveRebound() {
		return defensiveRebound;
	}

	public void setDefensiveRebound(Double defensiveRebound) {
		this.defensiveRebound = defensiveRebound;
	}

	public Double getAssists() {
		return assists;
	}

	public void setAssists(Double assists) {
		this.assists = assists;
	}

	public Double getTurnOvers() {
		return turnOvers;
	}

	public void setTurnOvers(Double turnOvers) {
		this.turnOvers = turnOvers;
	}

	public Double getSteals() {
		return steals;
	}

	public void setSteals(Double steals) {
		this.steals = steals;
	}

	public Double getBlocks() {
		return blocks;
	}

	public void setBlocks(Double blocks) {
		this.blocks = blocks;
	}

	public Double getPersonalFouls() {
		return personalFouls;
	}

	public void setPersonalFouls(Double personalFouls) {
		this.personalFouls = personalFouls;
	}

	public String getLogo() {
		return logo;
	}
	
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Team [id=").append(id).append(", teamName=").append(teamName).append(", gamesPlayed=")
				.append(gamesPlayed).append(", pointsScoredAverage=").append(pointsScoredAverage).append(", wins=")
				.append(wins).append(", losses=").append(losses).append(", winLossPercentage=")
				.append(winLossPercentage).append(", fieldGoalAttempt=").append(fieldGoalAttempt)
				.append(", fieldGoalMade=").append(fieldGoalMade).append(", fieldGoalPercentage=")
				.append(fieldGoalPercentage).append(", threePointAttempt=").append(threePointAttempt)
				.append(", threePointMade=").append(threePointMade).append(", threePointPercentage=")
				.append(threePointPercentage).append(", freeThrowAttempt=").append(freeThrowAttempt)
				.append(", freeThrowMade=").append(freeThrowMade).append(", freeThrowPercentage=")
				.append(freeThrowPercentage).append(", reboundsAverage=").append(reboundsAverage)
				.append(", offensiveRebound=").append(offensiveRebound).append(", defensiveRebound=")
				.append(defensiveRebound).append(", assists=").append(assists).append(", turnOvers=").append(turnOvers)
				.append(", steals=").append(steals).append(", blocks=").append(blocks).append(", personalFouls=")
				.append(personalFouls).append(", logo=").append(logo).append(", getId()=").append(getId())
				.append(", getTeamName()=").append(getTeamName()).append(", getGamesPlayed()=").append(getGamesPlayed())
				.append(", getPointsScoredAverage()=").append(getPointsScoredAverage()).append(", getWins()=")
				.append(getWins()).append(", getLosses()=").append(getLosses()).append(", getWinLossPercentage()=")
				.append(getWinLossPercentage()).append(", getFieldGoalAttempt()=").append(getFieldGoalAttempt())
				.append(", getFieldGoalMade()=").append(getFieldGoalMade()).append(", getFieldGoalPercentage()=")
				.append(getFieldGoalPercentage()).append(", getThreePointAttempt()=").append(getThreePointAttempt())
				.append(", getThreePointMade()=").append(getThreePointMade()).append(", getThreePointPercentage()=")
				.append(getThreePointPercentage()).append(", getFreeThrowAttempt()=").append(getFreeThrowAttempt())
				.append(", getFreeThrowMade()=").append(getFreeThrowMade()).append(", getFreeThrowPercentage()=")
				.append(getFreeThrowPercentage()).append(", getReboundsAverage()=").append(getReboundsAverage())
				.append(", getOffensiveRebound()=").append(getOffensiveRebound()).append(", getDefensiveRebound()=")
				.append(getDefensiveRebound()).append(", getAssists()=").append(getAssists())
				.append(", getTurnOvers()=").append(getTurnOvers()).append(", getSteals()=").append(getSteals())
				.append(", getBlocks()=").append(getBlocks()).append(", getPersonalFouls()=").append(getPersonalFouls())
				.append(", getLogo()=").append(getLogo()).append(", getClass()=").append(getClass())
				.append(", hashCode()=").append(hashCode()).append(", toString()=").append(super.toString())
				.append("]");
		return builder.toString();
	}


}