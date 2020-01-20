<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NBA Stat App</title>
</head>
<body>

	<h1><a href="/">NBA Stats App</a></h1>
	<p>A place for NBA stats nerds to get statistics quickly!</p>
	<br>

	<c:if test="${! empty team }">
		<h3>Teams Stats</h3>
		<table>
		<caption>Team Stats</caption>
			<tr>
				<th>Team </th>
				<th>Games Played </th>
				<th>Wins </th>
				<th>Losses </th>
				<th>Win% </th>
				<th>Points </th>
				<th>FGA </th>
				<th>FGM </th>
				<th>FG% </th>
				<th>3PA </th>
				<th>3PM </th>
				<th>3P% </th>
				<th>FTA </th>
				<th>FTM </th>
				<th>FT% </th>
				<th>Rebounds </th>
				<th>O Rebounds </th>
				<th>D Rebounds </th>
				<th>Assist </th>
				<th>TurnOvers </th>
				<th>Steals </th>
				<th>Blocks </th>
				<th>Pers Fouls </th>
			</tr>
			<tr>
				<td> ${team.teamName }</td>
				<td> ${team.gamesPlayed }</td>
				<td> ${team.wins }</td>
				<td> ${team.losses }</td>
				<td> ${team.winLossPercentage }</td>
				<td> ${team.pointsScoredAverage }</td>
				<td> ${team.fieldGoalAttempt }</td>
				<td> ${team.fieldGoalMade }</td>
				<td> ${team.fieldGoalPercentage }</td>
				<td> ${team.threePointAttempt }</td>
				<td> ${team.threePointMade }</td>
				<td> ${team.freeThrowMade }</td>
				<td> ${team.freeThrowPercentage }</td>
				<td> ${team.reboundsAverage }</td>
				<td> ${team.offensiveRebound }</td>
				<td> ${team.defensiveRebound }</td>
				<td> ${team.assists }</td>
				<td> ${team.turnOvers }</td>
				<td> ${team.steals }</td>
				<td> ${team.blocks }</td>
				<td> ${team.personalFouls }</td>

				
			</tr>

		</table>

	</c:if>

</body>
</html>