<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NBA Stats!</title>
</head>
<body>

	<h1><a href="/">NBA Stats App</a></h1>
	<p>A place for NBA stats nerds to get statistics quickly!</p>
	<br>
	
	<form action="updateTeamInDB.do" Method="POST">
	<fieldset>
	Team Name: <input type="text" name="teamName" required placeholder="${team.teamName }"><br>
	Games Played: <input type="number" name="gamesPlayed" min="0" max="82" step="1" required value="${team.gamesPlayed }"><br>
	Average Points: <input type="number" name="pointsScoredAverage" min="0" max="350" required value="${team.pointsScoredAverage }"><br>
	Wins: <input type="number" name="wins" min="0" max="82" step="1" required value="${team.wins }"><br>
	Losses: <input type="number" name="losses" min="0" max="82" step="1" required value="${team.losses }"><br>
	Win Percentage: <input type="number" name="winLossPercentage" min="0.0" max="1.0" step=".01" required value="${team.winLossPercentage }"><br>
	Field Goal Attempt: <input type="number" name="fieldGoalAttempt" required value="${team.fieldGoalAttempt }"><br>
	Field Goal Made: <input type="number" name="fieldGoalMade" required value="${team.fieldGoalMade }"><br>
	Field Goal Percentage: <input type="number" name="fieldGoalPercentage" min="0.0" max="100.00" step=".1" required value="${team.fieldGoalPercentage }"><br>
	Three Point Attempt: <input type="number" name="threePointAttempt" required value="${team.threePointAttempt }"><br>
	Three Point Made: <input type="number" name="threePointMade" required value="${team.threePointMade }"> <br>
	Three Point Percentage: <input type="number" name="threePointPercentage" min="0.0" max="100.00" step=".1"required value="${team.threePointPercentage }"><br>
	Free Throw Attempt: <input type="number" name="freeThrowAttempt" required value="${team.freeThrowAttempt }"><br>
	Free Throw Made: <input type="number" name="freeThrowMade" required value="${team.freeThrowMade }"><br>
	Free Throw Percentage: <input type="number" name="freeThrowPercentage" min="0.0" max="100.00" step=".1" required value="${team.freeThrowPercentage }"><br>
	Rebounds: <input type="number" name="reboundsAverage" min="0.0" max="200.00" step=".1" required value="${team.reboundsAverage }"><br>
	Offensive Rebounds: <input type="number" name="offensiveRebound" min="0.0" max="200.00" step=".1" required value="${team.offensiveRebound }"><br>
	Defensive Rebounds: <input type="number" name="defensiveRebound" min="0.0" max="200.00" step=".1" required value="${team.defensiveRebound }"><br>
	Assist: <input type="number" name="assists" min="0.0" max="100.00" step=".1" required value="${team.assists }"><br>
	Turn Overs: <input type="number" name="turnOvers" min="0.0" max="100.00" step=".1" required value="${team.turnOvers }"><br>
	Steals: <input type="number" name="steals" min="0.0" max="100.00" step=".1" required value="${team.steals }"><br>
	Blocks: <input type="number" name="blocks" min="0.0" max="100.00" step=".1" required value="${team.blocks }"><br>
	Personal Fouls: <input type="number" name="personalFouls" min="0.0" max="100.00" step=".1" required value="${team.personalFouls }"><br>
	<input type="hidden" name="logo" value="${team.logo }">
	<input type="hidden" name="id" value="${team.id }">
	<input type="submit" name="submit" value="Submit">
	</fieldset>
	</form>
	
</body>
</html>